

public abstract class Personnage extends Jeu {
	protected inventaire inv = new inventaire();
		

//abstract car on ne va jamais instancié des objets personnage mais directement des mages...

	String nom;
	String classe;
	int pv;
	int pf;
	
	
	//pas besoin de céateur mais je le garde en commentaire au cas où
	
	/*
public Personnage() {
		
		nom = "";
		classe = "";
		pv = 0;
		pf = 0;
		
	}
	
	public Personnage(String Unom, String Uclasse, int Upv, int Upf) {
		
		nom = Unom;
		classe = Uclasse;
		pv = Upv;
		pf = Upf;
		
	}
	
	*/
	public String getNom()  {  
	    return nom;
	  }
	
	public void setNom(String Unom)
	  {
	    nom = Unom;
	  }
	
	public String getClasse()  {  
	    return classe;
	  }
	
	public void setClasse(String Uclasse)
	  {
	    classe = Uclasse;
	  }
	
	public int getpv()  {  
	    return pv;
	  }
	
	public void setpv(int Upv)
	  {
	    pv = Upv;
	  }
	
	public int getpf()  {  
	    return pf;
	  }
	
	public void setpf(int Upf)
	  {
	    pf = Upf;
	  }
	
	
	public void PrendreDegats(Personnage Attaquant) {
		
		this.pv -= Attaquant.getpf();	
	}
	
	
	public void DonnerDegats(Personnage Cible) {
		
		Cible.PrendreDegats(this); //pas trop sur pour le "this" = le but serait d'entrer le personnage qui donne les degats dans la fonction PrendreDegats
	}
	
	public void VerificationDeLaVie() {
		
		if(getpv() <= 0) {
			
			System.out.println("Vous etes mort et enterre");
			FinDuJeu();	//fonction dans la classe Jeu
		}
	}
	
	public inventaire getInventaire() {
		
		return inv;
	}
			
	public void EngloutirPotion(String Unom, int Unombre) {
		
		if (Unom == "Soin") {
			
			// on va imposer un maximum de point de vie à 600
			
			if (this.getpv() + (25*Unombre) > 600) {
				
				System.out.println("Vous allez depasser le nombre de point de vie max (600) ");
				// relancer la demande
			}
			else {
				
				this.setpv(this.getpv() + (25*Unombre));
			
		}
		if (Unom == "Force") {
			
			// pas de max de force mais il faut un systeme de fin d'effet (ou rendre rare les potions de force il faut voir)
			this.setpf(this.getpf() + (10*Unombre));	//on va fixer la valeur de la potion à 10
				
			}
	}
		
		
	}
	
	
	
	

}
