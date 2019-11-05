public abstract class Jeu{

	

	public void Start() {
		
		//Lancement
	}
	
	

	
	public void FinDuJeu() {
		
		System.out.println("Voulez vous retenter votre chance ?");
		//bouton oui ou non
		//Si oui :
		Start();
		//Si non : fin du jeu
		System.exit(0);
	}
	
	
	
	
	
}
