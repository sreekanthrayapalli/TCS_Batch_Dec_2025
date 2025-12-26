package com.myc.example;

public class ThreadOdd implements Runnable{

	PrintNumbers pn;
	
	public ThreadOdd(PrintNumbers pn) {
		this.pn  = pn;
	}
	@Override
	public void run() {
	pn.printOdd();
		
	}

}
