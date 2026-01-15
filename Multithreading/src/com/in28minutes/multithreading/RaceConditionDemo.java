package com.in28minutes.multithreading;


public class RaceConditionDemo {

	public static void main(String[] args) {
		 Counter count1 = new Counter();
		 Counter count2 = new Counter();
		 Runnable task1 = new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<1000;i++) {
					count1.increment();
					count2.increment();
				}
				
			}
			 
		 };
		 
		 Runnable task2 = new Runnable() {

				@Override
				public void run() {
					for(int i=0;i<1000;i++) {
						count1.increment();
						count2.increment();
					}
					
				}
				 
			 };
		 Thread t1 = new Thread(task1);
		 Thread t2 = new Thread(task2);
		 t1.start();
		 t2.start();

		 try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Final count:"+count1.count);
		 
	}

}
