package greetings;

import printing.ColorCartridge;
import printing.Printer;

public class HelloWorld {

	public static void main(String[] args) {

		Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true, "MY PRINTER", ColorCartridge.GREEN);

		switch (printer.getCartridge()) {
		case BLUE:
			System.out.println("Blue");
			break;
		case GREEN:
			System.out.println("Green");
			break;

		case RED:
			System.out.println("Red");
			break;

		default:
			break;
		}

	}

}
