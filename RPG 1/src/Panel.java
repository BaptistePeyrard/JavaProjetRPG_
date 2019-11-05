

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel {//implements MouseListener{
	
	
	
	Image img;
	
	
	
  public void paintComponent(Graphics g){
	 

    try {
        img = ImageIO.read(new File("images.jpg"));
        
        //Pour une image de fond
        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
      } catch (IOException e) {
        e.printStackTrace();
      }    

}
  
}