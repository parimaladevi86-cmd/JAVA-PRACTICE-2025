package com.in28minutes.multithreading;

public class MultithreadSleepDemo implements Runnable {

	@Override
	public void run() {
		 
		for(int i =1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		MultithreadSleepDemo multidemo = new MultithreadSleepDemo();
		Thread t1 = new Thread(multidemo);
		Thread t2 = new Thread(multidemo); 
		t1.start();
		
		t2.start();
		 
		
		

	}
	

}
