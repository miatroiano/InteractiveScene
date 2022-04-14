//Author: Mia Troiano
//creates the bushes
import java.awt.Color;

import wheels.users.Ellipse;
import wheels.users.*;

public class bushes {
	 private Ellipse  bush2, bush3, bush4, bush5, bush6, bush7, bush8, bush9, bush10;
	 private Rectangle bush1;
	
	public bushes(){
		//sets bush size and shape
	    bush1 = new Rectangle();
	    bush1.setSize(140,90);
	    
	    bush2 = new Ellipse();
	    bush2.setSize(60,60);
	    
	    bush3 = new Ellipse();
	    bush3.setSize(60,60);
	    
	    bush4 = new Ellipse();
	    bush4.setSize(60,60);
	    
	    bush5 = new Ellipse();
	    bush5.setSize(60,60);
	    
	    bush6 = new Ellipse();
	    bush6.setSize(60,60);
	    
	    bush7 = new Ellipse();
	    bush7.setSize(60,60);
	    
	    bush8 = new Ellipse();
	    bush8.setSize(60,60);
	    
	    bush9 = new Ellipse();
	    bush9.setSize(60,60);
	   
	    bush10 = new Ellipse();
	    bush10.setSize(60,60);
	    
	    
	    //sets base location
	    this.setLocation(0, 0);
	    //sets base color
        this.setColor(new Color(16,91,20));
	}
	
	//sets all locations
	public void setLocation(int x, int y){ 
		bush1.setLocation(x,y);
	    bush2.setLocation(x + 25, y - 25);
	    bush3.setLocation(x - 25  ,y + 5);
	    bush4.setLocation(x + 125, y + 10);
	    bush5.setLocation(x + 65, y - 15);
	    bush6.setLocation(x - 5 , y - 15);
	    bush7.setLocation(x + 95, y - 15);
	    bush8.setLocation(x - 25, y + 40);
	    bush9.setLocation(x + 135, y + 40);
	    bush10.setLocation(x -12 ,y + 67);
	}
	//gets bush color
	public Color getColor(){
        return bush1.getColor();
    }
	
	//sets bush color
    public void setColor(Color color){
        bush1.setColor(color);
        bush2.setColor(color);
        bush3.setColor(color);
        bush4.setColor(color);
        bush5.setColor(color);
        bush6.setColor(color);
        bush7.setColor(color);
        bush8.setColor(color);
        bush9.setColor(color);
        bush10.setColor(color);
        
        
    }

}


