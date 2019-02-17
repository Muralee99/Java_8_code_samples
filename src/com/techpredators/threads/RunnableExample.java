package com.techpredators.threads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExample
{			
	public static void main(String args[])
	{
		Runnable runnable_1 = () -> {
			System.out.println("Executing Thread_1 inside");
		};
		
		Runnable runnable_2 = () -> {
			System.out.println("Executing Thread_2 inside");
		};
		
		Runnable runnable_3 = () -> {
			System.out.println("Executing Thread_3 inside");
		};
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);	
		
		executorService.submit(runnable_1);
		executorService.submit(runnable_2);
		executorService.submit(runnable_3);
		
		executorService.shutdown();

	}
}
