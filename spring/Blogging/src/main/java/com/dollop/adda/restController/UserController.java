package com.dollop.app.restController;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dollop.app.entity.Album;
import com.dollop.app.entity.Posts;
import com.dollop.app.entity.User;
import com.dollop.app.exception.EmailAlreadyExistException;
import com.dollop.app.exception.UserNotFoundException;
import com.dollop.app.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService us;

//----------------------GET USER PROFILE/DETAILS BY USERNAME--------------------------------------
	@GetMapping("/{username}/profile")
	private ResponseEntity<User> getUserByUserName(@PathVariable("username") String username) {
		ResponseEntity<User> response;
		try {
			response = new ResponseEntity<User>(this.us.getUserByUserName(username), HttpStatus.OK);
		} catch (UserNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}

//---------------------------GET ALL POSTS BY USERNAME------------------------------------
	@GetMapping("/{username}/posts")
	private ResponseEntity<List<Posts>> getPostsByUserName(@PathVariable("username") String username) {
		ResponseEntity<List<Posts>> response = new ResponseEntity<List<Posts>>(this.us.getPostsByUserName(username),
				HttpStatus.OK);
		return response;
	}

//------------------------GET ALL ALBUMS BY USERNAME-----------------------------------------
	@GetMapping("/{username}/albums")
	private ResponseEntity<List<Album>> getAlbumsByUserName(@PathVariable("username") String username) {
		ResponseEntity<List<Album>> response = new ResponseEntity<List<Album>>(this.us.getAlbumsByUserName(username),
				HttpStatus.OK);
		return response;
	}

//-------------------------CHECK USERNAME(EXIST OR NOT)-----------------------------------
	@GetMapping("/checkUsernameAvailability/{username}")
	private ResponseEntity<String> checkUsernameAvailability(@PathVariable("username") String username) {
		ResponseEntity<String> response = new ResponseEntity<String>(this.us.checkAvailabilityByUsername(username),
				HttpStatus.OK);
		return response;
	}

//-----------------------CHECK EMAIL(EXIST OR NOT)---------------------------------------
	@GetMapping("/checkEmailAvailability/{email}")
	private ResponseEntity<String> checkEmailAvailability(@PathVariable("email") String email) {
		ResponseEntity<String> response = new ResponseEntity<String>(this.us.checkAvailabilityByEmail(email),
				HttpStatus.OK);
		return response;
	}

//	---------------------------ONLY FOR ADMIN--------------------------------------
//	---------------------------ADD USER BY ADMIN-----------------------------------
	@PostMapping("")
	private ResponseEntity<User> addUserByAdmin(@RequestBody User user) {
		ResponseEntity<User> response;
		try {
			response = new ResponseEntity<User>(this.us.addUserByAdmin(user), HttpStatus.OK);

		} catch (EmailAlreadyExistException e) {
			e.printStackTrace();
			throw e;
		}
		return response;

	}

//	---------------------------ONLY FOR ADMIN--------------------------------------
//----------------------UPDATE USER BY USER NAME-----------------------------------
	@PutMapping("/{username}")
	private ResponseEntity<User> updateUserByAdmin(@PathVariable("username") String username, @RequestBody User user) {
		ResponseEntity<User> response;
		try {
			response = new ResponseEntity<User>(this.us.updateUserByAdmin(username, user), HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}

//	----------------DELETE USER BY ADMIN---------------------------------------
	@DeleteMapping("/{username}/delete")
	private ResponseEntity<String> deleteUserByAdmin(@PathVariable("username") String username, Principal principal) {
		ResponseEntity<String> response;
		try {
			response = new ResponseEntity<String>(this.us.userDelete(username, principal), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}

//--------------------GET LOGEDIN USER PROFILE/DETAILS--------------------------
	@GetMapping("/me")
	private ResponseEntity<User> getLoginUser(Principal principal) {
		ResponseEntity<User> response;
		try {
			response = new ResponseEntity<User>(this.us.getLoginUser(principal), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}

//----------------GIVE ADMIN ROLE TO USER-----------------------------------------
	@PutMapping("/{username}/giveAdmin")
	private ResponseEntity<String> giveAdminRoleToUser(@PathVariable String username, Principal principal) {
		ResponseEntity<String> response;
		try {
			response = new ResponseEntity<String>(this.us.giveAdmin(username, principal), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
//	------------------TAKE ADMIN ROLE TO ADMIN----------------------------------------
	@PutMapping("/{username}/TakeAdmin")
	private ResponseEntity<String> takeAdminRoleToAdmin(@PathVariable String username, Principal principal) {
		ResponseEntity<String> response;
		try {
			response = new ResponseEntity<String>(this.us.takeAdmin(username, principal), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
}
