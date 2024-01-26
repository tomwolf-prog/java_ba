package einheit3.tiere.mit_konstruktoren;

public class Tier extends Lebewesen {
	private String name;
	public Tier(String name) {
		super();
		this.name = name;
		System.out.println("Erstelle gerade ein Tier!");
	}
}
