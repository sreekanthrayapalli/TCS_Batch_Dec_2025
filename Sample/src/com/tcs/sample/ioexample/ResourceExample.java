package com.tcs.sample.ioexample;

public class ResourceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Resource r1 = new Resource()){
			r1.m1();
		}catch(Exception e) {
			
		}

	}

}
