
public class lieu{

	
	/*cette classe va gérer les lieux à afficher
	
	1 = Village 1346
	2 = Tour du sorcier
	3 = Foret en -52
	4 = 1916 dans les tranchées 
	5 = 2019 Dijon version 1
	6 = 2019 Dijon version 2
	
	
	*/
	
	public lieu() {
		
	}
	
	public void afficherLieu(int Temps) {
		
		switch (Temps)
		{
		  case 1:
		    System.out.println("Nous sommes dans un village en 1346");
		    break;
		  case 2:
		    System.out.println("Bienvenue dans la tour du sorcier");
		    break;
		  case 3:
		    System.out.println("Nous sommes dans une foret en -52");
		    break;
		  case 4:
			System.out.println("Nous sommes dans une tranchée en 1916");
			break;
		  case 5:
			System.out.println("Nous sommes à Dijon en 2019");
			break;    
		  case 6:
			System.out.println("Nous sommes à Dijon en 2019");
		  break;   
		  default:
		    System.out.println("Voyage en cours");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
