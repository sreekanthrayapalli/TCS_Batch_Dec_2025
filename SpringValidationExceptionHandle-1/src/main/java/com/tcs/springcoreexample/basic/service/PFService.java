package com.tcs.springcoreexample.basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.springcoreexample.basic.bean.PFBankDetails;
import com.tcs.springcoreexample.basic.repo.PFRepo;

@Service
public class PFService {

	@Autowired
	private PFRepo repo;
	
	public PFBankDetails getDetails(String pfno) {
		return repo.findByPfno(pfno);
	}
}
