package com.tcs.springcoreexample.basic.bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import lombok.Data;

@Entity
@Data
public class User implements UserDetails{

	@Id
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String details;

	@Column(name = "group_perimission")
	private String groupPerimssion;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		String [] userPerimissions = getGroupPerimssion().split(",");
		List<GrantedAuthority> list = new ArrayList<>();
		
		Stream.of(userPerimissions).forEach(x->{
			list.add(new SimpleGrantedAuthority(x));
		});
		
		
		return list;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
}
