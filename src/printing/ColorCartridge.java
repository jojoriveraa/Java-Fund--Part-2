package printing;

public enum ColorCartridge implements ICartridge
{
	BLUE("Blue"), 
	GREEN("Green"),
	RED("Red"),
	YELLOW("Yellow");
	
	private String colorText;

	private ColorCartridge(String colorText) {
		this.colorText = colorText;
	}
	
	@Override
	public String toString()
	{
		return "Color!";
	}

	@Override
	public String getFillPercentage() {
		return "97%";
	}
	
	@Override
	public String printColor() {
		return colorText;
	}
}
