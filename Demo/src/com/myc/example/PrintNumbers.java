package com.myc.example;

public class PrintNumbers {

	int max = 10;
	int st = 1;
	
	
	public synchronized void printEven() {
		while (st <= max) {
			if (st % 2 == 0) {
				System.out.println(st);
				st++;
				notify();
				
			} else {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

	public synchronized void printOdd() {
		while (st <= max) {
			if (st % 2 != 0) {
				System.out.println(st);
				st++;
				notify();
			} else {
				
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		PrintNumbers pn = new PrintNumbers();
		Thread t1 = new Thread(new ThreadOdd(pn));
		Thread t2 = new Thread(new ThreadEven(pn));
		
		t1.start();
		t2.start();
		
		
		

	}
}
