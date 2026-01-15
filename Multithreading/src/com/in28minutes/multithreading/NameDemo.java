package com.in28minutes.multithreading;

public class NameDemo extends Thread {
	
	public void run() {
		System.out.println("Running:"+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		NameDemo n1= new NameDemo();
		NameDemo n2= new NameDemo();
		//n1.setName("Worker1");
		//n2.setName("Worker2");
        n1.start();
        n2.start();
		 
	}

}
