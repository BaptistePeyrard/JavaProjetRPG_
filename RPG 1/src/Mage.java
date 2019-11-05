

public class Mage extends Personnage {
	protected inventaire inv = new inventaire();
	
	int pv;
	int pf;
	String classe;
	

	
	public Mage(inventaire I) {
		
		super();
		classe = "Mage";
		pv = 300;
		pf = 75;
		
	}
	
	
}
