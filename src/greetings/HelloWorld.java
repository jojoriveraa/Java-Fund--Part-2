package greetings;

import printing.BWCartridge;
import printing.ColorCartridge;
import printing.ICartridge;
import printing.Printer;

public class HelloWorld {

	public static void main(String[] args)
	{
		Printer<BWCartridge> printer  = new Printer<BWCartridge>(true, "MY PRINTER", new BWCartridge());
		Printer<ColorCartridge> printer2  = new Printer<ColorCartridge>(true, "MY PRINTER", new ColorCartridge());
		
		printOne(printer2);
		//printer.printUsingCartridge(new ColorCartridge(), "Hi!");
		//printer.print(1);
	}
	
	public static void printOne(Printer<? extends ICartridge> printer)
	{
		String fillPercentage = printer.getCartridge().getFillPercentage();
		System.out.println(fillPercentage);
	}
}
