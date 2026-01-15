package com.in28minutes.multithreading;

public class ThreadPriority implements Runnable {

	@Override
	public void run() {
		 for(int i =1;i<5;i++) {
			 System.out.println(Thread.currentThread().getName()+":"+i+"Priority:"+Thread.currentThread().getPriority() );
			 
		 }
		
	}

	public static void main(String[] args) {
		ThreadPriority priority = new ThreadPriority();
		Thread t1 = new Thread(priority);
		Thread t2 = new Thread(priority);
		t1.setName("Worker-1");
		t2.setName("Worker-2");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		

	}

	
}
