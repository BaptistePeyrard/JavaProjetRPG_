

public class choix {
	//protected dialogue dia = new dialogue();
	//protected lieu lie = new lieu();
	//protected combat comb = new combat();
	String ch1;	//choix1 deja pris par le bouton 1
	String ch2;
	String ch3;
	
	
public choix() {
		
		ch1 = "";
		ch2 = "";
		ch3 = "";
	}


	public choix(String c1, String c2, String c3) {
		
		ch1 = c1;
		ch2 = c2;
		ch3 = c3;
	}
	
	
	public String getChoix1(){
		return ch1;
	}
	
	public String getChoix2(){
		return ch2;
	}
	
	public String getChoix3(){
		return ch3;
	}
	
	public void LancerCombat(Personnage Joueur, Personnage Mechant) {
		//appelle un combat
	}
	
	public String LancerDialogue(int idChoix) {
		//appelle un dialogue
		dialogue dia = new dialogue();
		dia.setDialogue(idChoix);
		return dia.getDialogue();
		
	}
	
	public void ChangerLieu() {
		//appelle un lieu
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
