package com.tcs.sample.ioexample;

//if any class implements AutoCloseable interface then
//internally it calls close method when we create object 
//with try resource
public class Resource implements AutoCloseable{
	
	public void m1() {
		System.out.println("this is m1 method");
	}
	public void close() {
		System.out.println("close method called");
	}
}
