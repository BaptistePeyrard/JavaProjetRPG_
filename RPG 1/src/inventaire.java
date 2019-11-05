

public class inventaire{
	protected potion popo = new potion();
	//Objectif : Gérer le nombre de potions 

	
	int nbrS;	//pas sur de pouvoir initialiser comme ça
	int nbrF;
	
	public inventaire() {
		
		nbrS = 0;
		nbrF = 0;
		
	}
	
	public int getnbrS() {
		
		return nbrS;
	}
		
	public int getnbrF() {
		
		return nbrF;
	}
	
	
	
	public void PlusPotion(int Ajout,inventaire Inv, String nom ) {	//nom = Soin ou Force 
		
		if (nom == "Soin") {
		
			nbrS = Inv.getnbrS() + Ajout;
		
		}
		if (nom == "Force") {
			
			nbrF = Inv.getnbrF() + Ajout;
			
		}
		else {
			
			//erreur : pas normal !
		}
		
		
	}
	
	public void MoinsPotion(int Moins,inventaire Inv, String nom ) {	//nom = Soin ou Force 
		
		if (nom == "Soin") {
			if (Inv.getnbrS() == 0) {
				PasDePotion("Soin");
			}
			else {
				nbrS = Inv.getnbrS() - Moins;
			}
		}
		if (nom == "Force") {
			if (Inv.getnbrF() == 0) {
				PasDePotion("Force");
			}
			else {
			nbrF = Inv.getnbrF() - Moins;
			}
		}
		else {
			
			//erreur : pas normal !
		}
		
		
	}
	
	public void PasDePotion(String nom ) {
		
			System.out.println("Vous n'avez plus de potion de " + nom + " , c'est pas de chance !");
			
	}
	
	
	
}
