

public class histoire extends choix {
	//on va creer un personnage en fonction du choix de classe
	
	int idChoix = 1;
	String c1;
	String c2;
	String c3;

	/*
	 
	 0 :  1400 Debut/bataille/village/Tour : choix de la classe
	 1 : Gaulois ou romain
	 100 : combat 1
	 2 : choix de l'époque
	 200 : 1916 version 1
	 3 : choix de l'époque suite 200
	 201 : 2019 version 1
	 4 : choix de l'époque suite 201
	 202 : 2019 version 2 (1916 puis 2019)
	 5 : choix de l'époque suite 202
	 203 : -52 version 1 (1916 puis -52)
	 6 choix de l'époque suite 203
	 204 : 1916 version 2 (2019 puis 1916)
	 7 : choix de l'époque suite 204
	 205 : -52 version 2 (2019 puis -52)
	 8 : choix de l'époque suite 205
	 206 : 2019 version 3 (1916 puis -52 puis 2019)
	 9 : choix de l'époque suite 206
	 207 : 1916 version 3 (2019 puis -52 puis 1916)
	 300: choix finale
	 208 : -52 version 3 (2019 puis 1916 puis -52)
	 300 : choix finale
	 209 : -52 version 4 (1916 puis 2019 puis -52)
	 300 : choix finale
	 210 : 1400 version 2
	 101 : combat 2...
	 
	 */
	
	public int getIDchoix() {
		
		return idChoix;
	}
	
	public void AvancementChoix() {
		
		idChoix = getIDchoix() + 1;
	}
	
	public void Reception(int NumeroBouton) {

		System.out.println("changement effectue");
		
		
		
	
	}


	public String getBouton1(int NumeroBouton) {
		
		String c1 = "";
		
		if (getIDchoix() == 1) {
			if (NumeroBouton == 1) {
				c1 = "Eau";
			}
			if (NumeroBouton == 2) {
				c1 = "Deux Epees";
			}
			if (NumeroBouton == 3) {
				c1 = "Baskets";
			}
			return c1;
	}
		else {
			return "probleme";
		}
	}

	public String getBouton2(int NumeroBouton) {
		
		String c2 = "";
		
		if (NumeroBouton == 1) {
			c2 = "Feu";
		}
		if (NumeroBouton == 2) {
			c2 = "Epee et Bouclier";
		}
		if (NumeroBouton == 3) {
			c2 = "lunettes de protection";
		}
		return c2;
	}


	public String getBouton3(int NumeroBouton) {
		
		String c3 = "";
		
		if (NumeroBouton == 1) {
			c3 = "Terre";
		}
		if (NumeroBouton == 2) {
			c3 = "Mains nues";
		}
		if (NumeroBouton == 3) {
			c3 = "rien (difficile)";
		}
		return c3;
	}

	
	public String getDialogue(int idChoix) {
		//appelle choix
		return "exemple dialogue";
	}
	
	public void StartCombat(Personnage Joueur, Personnage Mechant) {
		//appelle choix
	}

	public void ChangementLieu(int époque) {
		//appelle choix
	}
	
}
