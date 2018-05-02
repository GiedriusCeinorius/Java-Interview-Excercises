package com.gceinorius.deadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeadLock {
	public void method1() {
		synchronized (String.class) {
			System.out.println("Aquired lock on String.class object");
			synchronized (Integer.class) {
				System.out.println("Aquired lock on Integer.class object");
			}
		}
	}

	public void method2() {
		synchronized (Integer.class) {
			System.out.println("Aquired lock on Integer.class object");
			synchronized (String.class) {
				System.out.println("Aquired lock on String.class object");
			}
		}
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			DeadLock dead1 = new DeadLock();
			DeadLock dead2 = new DeadLock();

			service = Executors.newFixedThreadPool(20);
			service.submit(() -> dead1.method1());
			service.submit(() -> dead2.method2());
		} finally {
			if (service != null) {
				service.shutdown();
			}
		}

	}
}
