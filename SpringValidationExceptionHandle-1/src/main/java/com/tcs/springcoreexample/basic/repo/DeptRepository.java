package com.tcs.springcoreexample.basic.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.springcoreexample.basic.bean.Dept;


public interface DeptRepository extends JpaRepository<Dept, String> {
}
