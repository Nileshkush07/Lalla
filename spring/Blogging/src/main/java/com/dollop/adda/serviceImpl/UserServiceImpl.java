package com.dollop.app.serviceImpl;

import java.security.Principal;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.dollop.app.entity.Album;
import com.dollop.app.entity.Posts;
import com.dollop.app.entity.RoleName;
import com.dollop.app.entity.Roles;
import com.dollop.app.entity.User;
import com.dollop.app.entity.UserRoles;
import com.dollop.app.exception.EmailAlreadyExistException;
import com.dollop.app.exception.UserAlreadyExistException;
import com.dollop.app.exception.UserNotFoundException;
import com.dollop.app.repository.UserRepo;
import com.dollop.app.service.UserService;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {
	@Autowired
	private UserRepo ur;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public User login(String userName, String pass) {
		User login = ur.findByUserNameAndpassword(userName, pass);
		if (login != null) {

			return login;
		}
		throw new UserNotFoundException("User Not Found Exception");
	}

	@Override
	public User signUp(User user) {
		User u;
		String encpwd = passwordEncoder.encode(user.getPassword());
		user.setPassword(encpwd);
		try {
			u = this.ur.save(user);
		} catch (Exception e) {
			e.printStackTrace();
			throw new UserAlreadyExistException("User Already exits with email " + user.getEmail());
		}

		return u;
	}

	@Override
	public User getUserByUserName(String userName) {
		User user = this.ur.findUserByUserName(userName);
		if (user != null) {
			return user;
		}
		throw new UserNotFoundException("User Not Found By " + userName + " User Name");
	}

	@Override
	public List<Posts> getPostsByUserName(String userName) {
		List<Posts> posts = this.ur.findPostsByUserName(userName).getPosts();

		return posts;
	}

	@Override
	public List<Album> getAlbumsByUserName(String userName) {
		// TODO Auto-generated method stub
		return this.ur.findAlbumsByUserName(userName).getAlbums();
	}

	@Override
	public String checkAvailabilityByUsername(String userName) {
		User user = this.ur.findUserByUserName(userName);

		return user != null ? "Availability : True" : "Availability : False";
	}

	@Override
	public String checkAvailabilityByEmail(String email) {
		User user = this.ur.findUserByEmail(email);

		return user != null ? "Availability : True" : "Availability : False";
	}

	@Override
	public User addUserByAdmin(User user) {
		User u;
		try {
			u = this.ur.save(user);
		} catch (Exception e) {
			throw new EmailAlreadyExistException("Email " + user.getEmail() + " Already Exist");
		}
		return u;
	}

	@Override
	public User updateUserByAdmin(String username, User user) {
		User u = this.ur.findUserByUserName(username);
		System.out.println(u);
		if (u != null) {
			return this.ur.save(user);

		}
		throw new UserNotFoundException("User " + username + " Not Found");

	}

	@Override
	public String userDelete(String username, Principal principal) {
		Optional<User> user = this.ur.findByUserName(principal.getName());
		if (user.isPresent()) {
			Optional<User> user1 = this.ur.findByUserName(username);
			if (user1.isPresent() && isAdmin(user1) && isUser(user1)) {
				this.ur.deleteById(user1.get().getId());
				return "User Deleted";
			} else {
				return "";
			}

		}

		throw new UserNotFoundException("User " + username + " Not Found");
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> optional = ur.findByUserName(username);
		if (optional.isEmpty()) {
			throw new UsernameNotFoundException(username + "Not Exist User ");
		}

		User user = optional.get();
		List<GrantedAuthority> authorities = user.getUserRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getRole().getRolename())).collect(Collectors.toList());
		return new org.springframework.security.core.userdetails.User(username, user.getPassword(), authorities);
	}

	private Boolean isAdmin(Optional<User> user) {
		if (user.isPresent())
			return user.get().getUserRoles().stream().anyMatch(new Predicate<UserRoles>() {

				@Override
				public boolean test(UserRoles t) {
					// TODO Auto-generated method stub
					if (t.getRole().getRolename().equals(RoleName.ADMIN.toString()))
						return true;
					return false;
				}
			});
		throw new UserNotFoundException("User Not Present ");
	}

	private Boolean isUser(Optional<User> user) {
		if (user.isPresent())
			return user.get().getUserRoles().stream().anyMatch(new Predicate<UserRoles>() {

				@Override
				public boolean test(UserRoles t) {
					// TODO Auto-generated method stub
					if (t.getRole().getRolename().equals(RoleName.USER.toString()))
						return true;
					return false;
				}
			});
		throw new UserNotFoundException("User Not Present ");
	}

	@Override
	public User getLoginUser(Principal principal) {
		String userName = principal.getName();
		System.out.println(userName + " USER");
		Optional<User> user = this.ur.findByUserName(userName);
		return user.get();
	}

	@Override
	public String giveAdmin(String username, Principal principal) {
		Optional<User> user = this.ur.findByUserName(username);
		if (user.isPresent()) {
			if (isAdmin(this.ur.findByUserName(username))) {
				return "User Already ADMIN";
			} else {
				UserRoles userRole = new UserRoles();
				userRole.setRole(new Roles(1L, RoleName.ADMIN.toString()));
				userRole.setUser(user.get());
				user.get().getUserRoles().add(userRole);

				this.ur.save(user.get());
				return "Now User is in ADMIN Role";
			}
		}
		throw new UsernameNotFoundException("User Not Found " + username);
	}

	@Override
	public String takeAdmin(String username, Principal principal) {
		Optional<User> user = this.ur.findByUserName(username);
		if (user.isPresent()) {
			if (isUser(this.ur.findByUserName(username))) {
				return "User Already is in User Role";
			} else {
				UserRoles userRole = new UserRoles();
				userRole.setRole(new Roles(1L, RoleName.USER.toString()));
				userRole.setUser(user.get());
				user.get().getUserRoles().add(userRole);

				this.ur.save(user.get());
				return "Now ADMIN is in USER Role";
			}
		}
		throw new UsernameNotFoundException("User Not Found " + username);
	}
}
