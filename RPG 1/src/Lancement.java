
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Lancement extends affichage{
	protected histoire Histoire = new histoire();

	
	
	
	
	
	
	public Lancement(String c1, String c2, String c3){
	
		
		
		super(c1, c2, c3);
		JPanel content = new JPanel();
		
	    this.setTitle("Jean-Wilfried");
	    this.setSize(1000, 1000);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    this.setResizable(true);
	    this.setAlwaysOnTop(false);
	    

		    
		    this.setVisible(true);
		    
		    
		   
	}
	
	
	  
	
	
	
	
	
	
	
	
	
 public static void main(String[] args) throws IOException {
	/*	
	 //serveur 
	 
	ServerSocket s1 = new ServerSocket(1342);
	 Socket ss = s1.accept();
	*/ 
	 
	 
	 
	 
	 
	 
	 Scanner sc = new Scanner(System.in);
	 Socket s = new Socket("127.0.0.1", 1342);
	 
	 
	 
	 
		 Lancement fen = new Lancement("Mage", "Guerrier", "loic (difficile)");
		
	
		 
	 }
	}


