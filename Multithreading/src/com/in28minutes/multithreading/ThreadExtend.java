package com.in28minutes.multithreading;

public class ThreadExtend extends Thread{
 
	public void run() {
		System.out.println("Hello from thread");
	}
	
	public static void main(String[] args) {
		ThreadExtend t1 = new ThreadExtend();
		t1.start();
		 
	}

}
