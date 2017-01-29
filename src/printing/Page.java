package printing;

public class Page {
	private String printedText;

	public Page(String text) {
		this.printedText = text;
	}

	public String getText() {
		return printedText;
	}
}
