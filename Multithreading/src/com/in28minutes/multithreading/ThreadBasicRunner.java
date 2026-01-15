package com.in28minutes.multithreading;


class Task1 extends Thread{
	public void run(){
  System.out.println("Task1 started");
  for(int i =101;i<199;i++)
		System.out.println(i+" ");
  System.out.println("\ntask1 done");

}
}

class Task2 implements Runnable{
	public void run(){
  System.out.println("Task2 started");
  for(int i =201;i<299;i++)
		System.out.println(i+" ");
  System.out.println("\ntask2 done");

}
}
public class ThreadBasicRunner {

	public static void main(String[] args) throws InterruptedException {
		 
		System.out.println("\nTask1 kicked off");
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();
		
		System.out.println("\nTask2 kicked off");
		 Task2 task2 = new Task2();
		 Thread task2thread = new Thread(task2);
		 task2thread.setPriority(10);
		 task2thread.start();
		 
		 
         task1.join();
         task2thread.join();
		System.out.println("\nTask3 kicked off");
		for(int i =301;i<399;i++)
			System.out.println(i+" ");
		System.out.println("task3 done");
         System.out.println("main done");
	}

}
