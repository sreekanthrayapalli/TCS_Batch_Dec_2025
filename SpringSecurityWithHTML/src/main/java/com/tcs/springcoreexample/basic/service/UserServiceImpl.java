package com.tcs.springcoreexample.basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tcs.springcoreexample.basic.bean.User;
import com.tcs.springcoreexample.basic.repo.UserRepository;

@Service
public class UserServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user1= new User();
		user1.setUsername("abc");
		user1.setPassword("$2b$10$waDb8.vmRloYpy0RydtGMe96k7JP94qWpeh7a5ji0h8.lnAYIMU/C");
		User user = userRepo.findByUsername(username);
		return user;
	}

}
