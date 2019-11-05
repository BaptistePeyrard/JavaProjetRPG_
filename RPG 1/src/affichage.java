import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;





//import Lancement.Bouton1Listener;



public class affichage extends JFrame{
	protected histoire Histoire = new histoire();
	private JButton choix1;
	private JButton choix2;
	private JButton choix3;
	
	
	public affichage(String c1, String c2, String c3) {
		
		
		
		
		this.setContentPane(new Panel());
	    
	    
	    choix1 = new Bouton(c1);
	    
	    choix2 = new Bouton(c2);
	    
	    choix3 = new Bouton(c3);
	    
	    
	    
	    
	    choix1.setPreferredSize(new Dimension(200, 100));		
		   
	    choix2.setPreferredSize(new Dimension(200, 100));
	   
	    choix3.setPreferredSize(new Dimension(200, 100));
		
		
		
	    //On définit le layout manager
	    getContentPane().setLayout(new GridBagLayout());
	
			
	
	    
	  
	    
	    
	    
	    
	    
	    getContentPane().add(choix1);
	    
	   
	    
	    getContentPane().add(choix2);
	    
	 
	    
	    getContentPane().add(choix3);
	    
	   
	   
	   
	    
	    
	    
	    choix1.addActionListener(new Bouton1Listener());
	    
	    choix2.addActionListener(new Bouton2Listener());
		   
		choix3.addActionListener(new Bouton3Listener());
		
		
		
}
	
	public JButton getChoix1() {
		
		return choix1;
	}
	
	public JButton getChoix2() {
		
		return choix2;
	}	

	public JButton getChoix3() {
	
		return choix3;
	}	
	
	
	
	
	class Bouton1Listener extends JFrame implements ActionListener{
	    //Redéfinition de la méthode actionPerformed()
	    public void actionPerformed(ActionEvent e) {
	    	String c1 = "";
	    	String c2 = "";
	    	String c3 = "";
	    	c1 = Histoire.getBouton1(1);
	    	c2 = Histoire.getBouton2(1);
	    	c3 = Histoire.getBouton3(1);;
	    	Histoire.AvancementChoix();
	    	Lancement lan = new Lancement(c1,c2,c3);
	    }
	  }      
	
	class Bouton2Listener extends JFrame implements ActionListener{
	    //Redéfinition de la méthode actionPerformed()
	    public void actionPerformed(ActionEvent e) {
	    	String c1 = "";
	    	String c2 = "";
	    	String c3 = "";
	    	c1 = Histoire.getBouton1(2);
	    	c2 = Histoire.getBouton2(2);
	    	c3 = Histoire.getBouton3(2);
	    	Histoire.AvancementChoix();
	    	Lancement lan = new Lancement(c1,c2,c3);
	    }

		
	  }      
	
	class Bouton3Listener implements ActionListener{
	    //Redéfinition de la méthode actionPerformed()
	    public void actionPerformed(ActionEvent e) {
	    	String c1 = "";
	    	String c2 = "";
	    	String c3 = "";
	    	c1 = Histoire.getBouton1(3);
	    	c2 = Histoire.getBouton2(3);
	    	c3 = Histoire.getBouton3(3);
	    	Histoire.AvancementChoix();
	    	Lancement lan = new Lancement(c1,c2,c3);
	    	
	    }
	  }      
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	

