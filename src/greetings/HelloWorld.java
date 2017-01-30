package greetings;

import printing.ColorCartridge;
import printing.Printer;

public class HelloWorld {

	public static void main(String[] args) {
		Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true, "MY PRINTER", ColorCartridge.RED);
		
		for(ColorCartridge cartridge : ColorCartridge.values()){
			System.out.println(cartridge.printColor());
		}
		
	}

}
