package com.myc.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Singleton {
	private static final Singleton obj;

	private Singleton() {
		Lock lock = new ReentrantLock();

		lock.lock();
		if (obj == null) {
			obj = new Singleton();
		}
		lock.unlock();
	}

	public static Singleton getObj() {

		return obj;
	}
}
