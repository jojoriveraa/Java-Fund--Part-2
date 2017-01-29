package greetings;

import printing.BWCartridge;
import printing.Printer;

public class HelloWorld {

	public static void main(String[] args) {
		Printer<BWCartridge> printer = new Printer<BWCartridge>(true, "MY PRINTER", new BWCartridge());
		
		printer.loadPaper(10);
		printer.print(5);
		printer.outputPages();
	}
}
