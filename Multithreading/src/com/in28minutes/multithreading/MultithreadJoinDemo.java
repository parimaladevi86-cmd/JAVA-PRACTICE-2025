package com.in28minutes.multithreading;

public class MultithreadJoinDemo implements Runnable {

	@Override
	public void run() {
		 
		for(int i =1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			/*
			 * try { Thread.sleep(1000); } catch (InterruptedException e) {
			 * 
			 * e.printStackTrace(); }
			 */
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		MultithreadJoinDemo multidemo = new MultithreadJoinDemo();
		Thread t1 = new Thread(multidemo);
		Thread t2 = new Thread(multidemo); 
		t1.start();
		t1.join();
		t2.start();
		 
		
		

	}
	

}
