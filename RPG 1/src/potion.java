public class potion extends objet {

	
	
	
	int puissance;
	
	
	
	
	

	public potion() {
		
		nom = "";
		nombre = 0;
		
	}
	
	public potion(int Unombre, String Unom) {
		
		nombre = Unombre;
		nom = Unom;
	}
	
	public String getNom() {
		
		return nom;
	}
	
	public void setNom(String Unom) {
		
		nom = Unom;
	}
		
	public int getNombre() {
		
		return nombre;
	}
	
	public void setNombre(int Unombre) {
		
		nombre = Unombre;
	}
	
	public void PotionSoin(potion PotionS, int Unombre) {
		
		PotionS.setNom("Potion De Soin");
		PotionS.setNombre(Unombre);
		
	}
	
	public void PotionForce(potion PotionF, int Unombre) {
		
		PotionF.setNom("Potion De Soin");
		PotionF.setNombre(Unombre);
		
	}

}
