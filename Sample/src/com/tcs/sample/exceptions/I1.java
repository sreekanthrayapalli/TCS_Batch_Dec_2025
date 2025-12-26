package com.tcs.sample.exceptions;

import java.util.logging.Logger;

public class I1 implements AutoCloseable{
	private static final Logger log = Logger.getLogger(I1.class.toString());
	void m1() {
		System.out.println("it is sdldkfj");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("it is closed....");
		
	}

	public static void main(String[] args) throws Exception {
		 
		try(final I1 obj = new I1()){
			obj.m1();
		}catch(Exception e) {
			log.info("done2.");
		}finally {
			log.info("done");
		}
	}
}
