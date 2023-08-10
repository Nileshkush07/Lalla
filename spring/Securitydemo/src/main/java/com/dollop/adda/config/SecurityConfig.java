package com.dollop.adda.config;



import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity

public class SecurityConfig {
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	//Authentication(in memory)
	  
public UserDetailsService userDetailsServices(DataSource dataSource) {
	   
	   UserDetails user1=User.withUsername("lalla").password("ccf7a96f-2caa-484f-a0cb-1724a37f264b").authorities("admin").build();
	   
	   UserDetails user2=User.withUsername("nilesh").password("ccf7a96f-2caa-484f-a0cb-1724a37f264b").authorities("customer").build();
	   
	   JdbcUserDetailsManager users=new JdbcUserDetailsManager(dataSource);
	   users.createUser(user1);
	   users.createUser(user2);
	   return  users;
	   
   }
	
	//Authorization
   

   public SecurityFilterChain configurePath(HttpSecurity http) throws Exception{
	   
	   http.authorizeHttpRequests(
			   request->request.antMatchers("/home").permitAll()
			   .antMatchers("/admin").hasAuthority("ADMIN")
			   .anyRequest().authenticated()
			   
			   )
	   
	   .formLogin(form->form.loginPage("/login").permitAll())
	   .logout(logout->logout.permitAll());
	   return http.build();
	   
   }
	
	
	
	
}
