//Author: Mia Troiano
//creates the grass and hills
import java.awt.Color;
import wheels.users.*;

public class grass {
	private PressGrass grass1, grass2, hill1, hill2, hill3, hill4, hill5,bottom;
	
	
	public grass() {
		//grass/hills class sets size  and shape
		
		
		hill4 = new PressGrass();
		hill4.setSize(400, 100);
		
		
		hill5 = new PressGrass();
		hill5.setSize(420, 100);
		
		
		hill1 = new PressGrass();
	    hill1.setSize(400, 200);
	    
	        
	    hill2 = new PressGrass();
	    hill2.setSize(200, 100);
	    
	       
	    hill3 = new PressGrass();
	    hill3.setSize(400, 100);
	   
	        
		grass1 = new PressGrass();
        grass1.setSize(320, 100);
        
		
        grass2 = new PressGrass();
        grass2.setSize(450, 100);
       
        
        bottom = new PressGrass();
        bottom.setSize(750, 80);
        
        
        //sets base color 
        this.setColor(new Color(144,171,94));
        
       
	}
	//sets location of hill/grass
	public void setLocation(int x, int y){
		hill4.setLocation(x,y);
	    grass1.setLocation(x - 20, y + 100);
	    grass2.setLocation(x + 290, y + 100);
	    bottom.setLocation(x - 20, y + 140);
	    hill1.setLocation(x + 420, y + 50);
	    hill2.setLocation(x - 30, y + 50);
	    hill3.setLocation(x + 120, y + 50);
	    hill5.setLocation(x + 320, y + 20);
	    
	}
	//gets color of hill 
	public Color getColor(){
        return hill4.getColor();
    }
	
	//sets color to all 
    public void setColor(Color color){
        hill4.setColor(color);
        hill1.setColor(new Color(94,171,98));
        hill2.setColor(new Color(94,171,98));
        hill3.setColor(new Color(94,171,98));
        hill5.setColor(color);
        
        grass1.setColor(new Color(14,153,20));
        grass2.setColor(new Color(14,153,20));
        bottom.setColor(new Color(14,153,20));
          
    }
    //gets x location
    public int getXLocation() {
		
		return hill4.getXLocation();
	}
	//gets y location
	public int getYLocation() {
		
		return hill4.getYLocation();
	}

}

