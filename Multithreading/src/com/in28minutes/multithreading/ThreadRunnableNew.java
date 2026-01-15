package com.in28minutes.multithreading;

public class ThreadRunnableNew implements Runnable {
	
	
	@Override
	public void run() {
		 System.out.println("Hello from Thread Runnable class");
	}
	
    public static void main(String[] args) {
    	Thread t2= new Thread(new ThreadRunnableNew());
    	t2.start();
    	
		
	}

}
