package com.in28minutes.multithreading;

public class ThreadRunStart implements Runnable {


	@Override
	public void run() {
		 System.out.println("Running in:"+Thread.currentThread().getName());
		
	}
	

	public static void main(String[] args) {
		 Thread t3 = new Thread(new ThreadRunStart());
		 t3.run();
		 t3.start();
		

	}

}
