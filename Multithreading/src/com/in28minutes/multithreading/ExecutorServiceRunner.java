package com.in28minutes.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
	
	private int number;
	
	public Task(int number){
		this.number=number;
	}
	
	public void run(){
    System.out.println("Task" +number+ "started");
  
  for(int i =number*100;i<=number*100+99;i++)
  System.out.println(i+" ");
  
  System.out.println("\ntask"+number+"done");

}
}


public class ExecutorServiceRunner {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		//ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		//executorService.execute(new Task(5));
		//executorService.execute(new Task(6));
		//executorService.execute(new Task(7));
		//executorService.execute(new Thread(new Task2()));
		
		/*
		 * System.out.println("\nTask3 kicked off"); for(int i =301;i<399;i++)
		 * System.out.println(i+" "); System.out.println("task3 done");
		 * System.out.println("main done");
		 */
         executorService.shutdown();

	}

}
