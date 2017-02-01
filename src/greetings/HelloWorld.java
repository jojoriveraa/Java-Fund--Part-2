package greetings;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import printing.ContinuousPrinter;

public class HelloWorld {

	public static void main(String[] args){
		
		ContinuousPrinter cp = new ContinuousPrinter();
//		Thread thread = new Thread(cp);
//		thread.start();
		
		ExecutorService executor = Executors.newFixedThreadPool(10);
		executor.submit(cp);
		executor.submit(cp);
		executor.submit(cp);
		executor.submit(cp);
		executor.submit(cp);
		executor.submit(cp);
		executor.shutdown();
		
		
		for (int i = 0; i < 100; i++){
			System.out.println("Main thread" + i);
		}
	}

}
