package greetings;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import printing.BWCartridge;
import printing.Printer;

public class HelloWorld {

	public static void main(String[] args) {

		Printer<BWCartridge> printer = new Printer<BWCartridge>(true, "MY PRINTER", new BWCartridge());
		
		Queue<String> myQueue = new LinkedList<String>();
		
		myQueue.offer("a");
		myQueue.offer("b");
		myQueue.offer("c");
		
		while(myQueue.peek() != null){
			System.out.println(myQueue.poll());
		}
		
	}
}
