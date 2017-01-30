package printing;

import java.util.HashMap;
import java.util.Map;

public class Printer<T extends ICartridge> implements IMachine 
{
	private String modelNumber;
	private PaperTray paperTray = new PaperTray();
	private Machine machine;
	private T cartridge;
	private Map<Integer, Page> pagesMap = new HashMap<Integer, Page>();
	
	public Printer(boolean isOn, String modelNumber, T cartridge)
	{
		machine = new Machine(isOn);
		this.modelNumber = modelNumber;
		this.cartridge = cartridge;
	}
	
	@Override
	public void TurnOn()
	{
		System.out.println("Warming up printer");
		machine.TurnOn();
	}
	
	public <U extends ICartridge> void printUsingCartridge(U cartridge, String message)
	{
		System.out.println(cartridge.toString());
		System.out.println(message);
		System.out.println(cartridge.toString());
	}
	
	
	public void print(int copies)
	{
		CheckCopies(copies);
		
		String onStatus = "";
		if(machine.isOn()){
			onStatus = " is On!";
		}
		else{
			onStatus = " is Off!";
		}
		int pageNumber = 1;
		
		String textToPrint = modelNumber + onStatus;
		textToPrint += "|||" + cartridge.printColor() + "|||";
		
		
		while( copies > 0 && !paperTray.isEmpty() )
		{
			pagesMap.put(pageNumber, new Page(textToPrint + ":" + pageNumber));
			copies--;
			pageNumber++;
			paperTray.usePage();
		}
		
		if(paperTray.isEmpty())
			System.out.println("Load more paper!");
	}
	

	public void outputPage(int pageNumber) {
		System.out.println(pagesMap.get(pageNumber).getText());
	}
	
	private void CheckCopies(int copies) {
		if (copies <0){
			throw new IllegalArgumentException("Can't print less than 0 copies");
		}
	}
	
	public void printColors()
	{
		String[] colors = new String[] { "Red", "Blue", "Green", "Yellow", "Orange" };
		
		for( String currentColor : colors )
		{
			if("Green".equals(currentColor))
				continue;
			
			System.out.println(currentColor);
		}
		
	}
	
	public String getModelNumber()
	{
		return modelNumber;
	}
	
	public T getCartridge()
	{
		return cartridge;
	}

	public void loadPaper(int count) 
	{
		paperTray.addPaper(count);
	}

	@Override
	public void TurnOff() {
		machine.TurnOff();
		System.out.println("Machine is off");
	}

	@Override
	public boolean isOn() {
		return machine.isOn();
	}
}
