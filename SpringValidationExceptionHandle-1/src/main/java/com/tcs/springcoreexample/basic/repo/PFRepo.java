package com.tcs.springcoreexample.basic.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.springcoreexample.basic.bean.PFBankDetails;

public interface PFRepo extends JpaRepository<PFBankDetails, Integer> {

	public PFBankDetails findByPfno(String pfno);
}
