package printing;

public enum ColorCartridge implements ICartridge
{
	BLUE, 
	GREEN,
	RED;
	
	@Override
	public String toString()
	{
		return "Color!";
	}

	@Override
	public String getFillPercentage() {
		return "97%";
	}
}
