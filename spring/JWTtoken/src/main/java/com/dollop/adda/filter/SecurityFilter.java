package com.dollop.adda.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.dollop.adda.util.JWTUtils;


@Component
public class SecurityFilter extends OncePerRequestFilter{
@Autowired
	private JWTUtils jwtUtil;

@Autowired
private UserDetailsService userDetailsService;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String token=request.getHeader("authorization");
		if(token!=null) {
			String username=jwtUtil.getuname(token);
			if(username!=null && SecurityContextHolder.getContext().getAuthentication()==null){
				UserDetails user=userDetailsService.loadUserByUsername(username);
				UsernamePasswordAuthenticationToken Authentication=new UsernamePasswordAuthenticationToken(username,user.getPassword(),user.getAuthorities());
				Authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(Authentication);
				
			}
		}
		
		filterChain.doFilter(request, response);
		
	}
	
	

}
