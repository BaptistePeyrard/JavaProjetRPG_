
public class combat{

	
	
	
	
	
	
	public combat() {
		
		
	}
	
	public combat(Personnage Joueur, PetitsMechants Mechant) {
		
		int compteur = 0;
		while (Joueur.getpv() > 0 && Mechant.getpv() > 0) {
			
			if (compteur == 0) {
			
				TourJ1(Joueur, Mechant);
				compteur = 1;
			}
			if (compteur == 1) {
				
				TourJ2(Joueur, Mechant);
				compteur = 0;
			}
		}
	
		Joueur.VerificationDeLaVie();
		Recompense(Joueur);
		FinDeCombat();
		
		
	}
	
	public void TourJ1(Personnage Joueur, PetitsMechants Mechant) {
		
		System.out.println("Que voulez vous faire ?");
		String choix ="";
			//choix : attaquer / prendre une potion / fuir(uniquement si Loic)
		if (choix == "attaquer") {
			
			Joueur.DonnerDegats(Mechant);	//à vérifier
		}
		if (choix == "prendre une potion") {
			String nom ="";
			System.out.println("Potion de force ou potion de soin ?");
			//nom : force ou soin
			int nombre = 0;
			System.out.println("Combien ?");
			//nombre : 1 ,2, 3
			inventaire I;
			I = Joueur.getInventaire();
			I.MoinsPotion(nombre, I, nom);
			Joueur.EngloutirPotion(nom, nombre);
		}
		if (choix == "fuire") {
			System.out.println("Vous avez fuis avec lacheté");
			Mechant.setpv(0);	
		}
		else {
			//erreur
		}
	}
	
	public void TourJ2(Personnage Joueur, PetitsMechants Mechant) {
		
		Mechant.DonnerDegats(Joueur);
	}
	
	public void Recompense(Personnage Joueur) {
		
		if (Joueur.getpv() < 100) {
			//Ajouter des potions A FAIRE !!
		}
	}
	
	public void FinDeCombat() {
		
		
	}
	
}
