package com.jwtme.models;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
	ROLE_ADMIN("ROLE_ADMIN"), ROLE_USER("ROLE_USER");

	final String name;

	Role(String name) {
		this.name = name;
	}

	@Override
	public String getAuthority() {
		return this.name;
	}

	public String getName() {
		return name;
	}
}
