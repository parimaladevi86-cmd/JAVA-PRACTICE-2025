package com.in28minutes.multithreading;

public class ThreadRunnable implements Runnable {
	
	public void run() {
		System.out.println("Thread running using Runnable");
	} 

	public static void main(String[] args) {
		  Thread t = new Thread(new ThreadRunnable() );
		  t.start();

	}

}
