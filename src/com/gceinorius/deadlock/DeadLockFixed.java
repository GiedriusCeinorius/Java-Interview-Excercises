package com.gceinorius.deadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeadLockFixed {
	public void method1() {
		synchronized (String.class) {
			System.out.println("Aquired lock on String.class object");
			synchronized (Integer.class) {
				System.out.println("Aquired lock on Integer.class object");
			}
		}
	}

	public void method2() {
		synchronized (String.class) {
			System.out.println("Aquired lock on String.class object");
			synchronized (Integer.class) {
				System.out.println("Aquired lock on Integer.class object");
			}
		}
	}

	public static void main(String[] args) {

		ExecutorService service = null;
		try {
			DeadLockFixed fixed1 = new DeadLockFixed();
			DeadLockFixed fixed2 = new DeadLockFixed();
			service = Executors.newFixedThreadPool(20);
			service.submit(() -> fixed1.method1());
			service.submit(() -> fixed2.method2());
		} finally {
			if (service != null) {
				service.shutdown();
			}
		}

	}
}