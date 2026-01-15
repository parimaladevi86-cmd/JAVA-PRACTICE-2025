package com.in28minutes.multithreading;

public class MultipleThreads extends Thread {

	public void run() {
		for (int i=1;i<=3;i++) {
		System.out.println(Thread.currentThread().getName()+ ":"+i);
		}
	}
	public static void main(String[] args) {
		MultipleThreads t1 = new MultipleThreads();
		t1.start();
		MultipleThreads t2 = new MultipleThreads();
		t2.start();
		MultipleThreads t3 = new MultipleThreads();
		t3.start();
		 
	}

}
