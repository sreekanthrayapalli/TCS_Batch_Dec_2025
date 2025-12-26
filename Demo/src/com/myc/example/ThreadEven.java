package com.myc.example;

public class ThreadEven implements Runnable{

	PrintNumbers pn;
	
	public ThreadEven(PrintNumbers pn) {
		this.pn  = pn;
	}
	@Override
	public void run() {
	pn.printEven();
		
	}

}
