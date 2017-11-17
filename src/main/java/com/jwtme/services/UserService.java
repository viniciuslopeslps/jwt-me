package com.jwtme.services;

import com.jwtme.daos.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserService implements UserDetailsService {

	@Autowired
	private UserDao UserDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return UserDao.findByEmail(username);
	}
}
