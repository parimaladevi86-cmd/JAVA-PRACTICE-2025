package com.in28minutes.multithreading;

public class MultithreadDemo implements Runnable {

	@Override
	public void run() {
		 
		for(int i =1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
	
	public static void main(String[] args) {
		MultithreadDemo multidemo = new MultithreadDemo();
		Thread t1 = new Thread(multidemo);
		Thread t2 = new Thread(multidemo);
		t1.start();
		t2.start();
		
		

	}
	

}
