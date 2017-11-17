package com.jwtme.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jwtme.models.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

	@Query("select u from User u where u.email=?1")
	User findByEmail(String username);

}
