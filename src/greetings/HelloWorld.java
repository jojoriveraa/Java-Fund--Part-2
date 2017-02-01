package greetings;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import printing.ColorCartridge;
import printing.Printer;
import printing.PrintingDevice;

public class HelloWorld {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true, "MY PRINTER", ColorCartridge.RED);

		printer.loadPaper(10);
		
		PrintingDevice annotation = printer.getClass().getAnnotation(PrintingDevice.class);
		
		Method printMethod = printer.getClass().getMethod(annotation.defaultPrintMethod(), int.class);
				
		printMethod.invoke(printer, annotation.defaultNumberOfCoppies());
		
		printer.outputPage(5);
				
	}

}
