package com.jwtme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.jwtme.daos.UserDao;
import com.jwtme.models.User;

@Component
public class UserService implements UserDetailsService {

	@Autowired
	private UserDao UserDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = UserDao.findByEmail(username);
		return user;
	}
}
