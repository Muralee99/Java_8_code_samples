package com.techpredators.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public class CallableExample {
	public static void main(String[] args) throws Exception {

		try {
			ExecutorService service = Executors.newSingleThreadExecutor();
			Stream<String> stream = Stream.of("abc", "def", "ghi", "jkl");
			SampleTask sumTask = new SampleTask(stream);
			Future<Long> future = service.submit(sumTask);
			Long result = future.get();
			System.out.println(result);
		} catch (InterruptedException interruptedException) {
			System.out.println("InterruptedException occured "
					+ interruptedException.getMessage());
		} catch (ExecutionException executionException) {
			System.out.println("ExecutionException occured "
					+ executionException.getMessage());
		}
	}
}

class SampleTask implements Callable<Long> {
	private Stream<String> stream = null;

	public SampleTask(Stream<String> stream) {
		this.stream = stream;
	}

	@Override
	public Long call() throws Exception {
		return this.stream.count();
	}
}