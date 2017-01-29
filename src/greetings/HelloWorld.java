package greetings;

import printing.BWCartridge;
import printing.Printer;

public class HelloWorld {

	public static void main(String[] args) {
		Printer<BWCartridge> printer = new Printer<BWCartridge>(true, "MY PRINTER", new BWCartridge());
		
		try {
			printer.print(-1);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} finally {
			printer.TurnOff();
		}
	}
}
