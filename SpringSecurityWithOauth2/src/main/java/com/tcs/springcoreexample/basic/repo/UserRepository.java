package com.tcs.springcoreexample.basic.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.springcoreexample.basic.bean.User;

public interface UserRepository extends JpaRepository<User, String> {

	User findByUsername(String username);
}
