package com.in28minutes.multithreading;

public class Mythread extends Thread {

	public void run() {
		System.out.println("Thread running ");
	}
	
	public static void main(String[] args) {
		 Mythread t = new Mythread();
		 t.start();

	}

}
