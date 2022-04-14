//Author: Mia Troiano
//creates the rays from the sun
import java.awt.Color;

import wheels.users.*;

public class Rays {
	
	private Line ray1, ray2, ray3, ray4, ray5, ray6, ray7;
	public Rays() {
        
        ray1 = new Line();
        ray1.setThickness(10);
        
        ray2 = new Line();
        ray2.setThickness(10);
        
        ray3 = new Line();
        ray3.setThickness(10);
        
        ray4 = new Line();
        ray4.setThickness(10);
       
        ray5 = new Line();
        ray5.setThickness(10);
        
        ray6 = new Line();
        ray6.setThickness(10);
        
        ray7 = new Line();
        ray7.setThickness(10);
        
        
        this.setLocation(0, 0);
        this.setColor(new Color(233,247,94));
        
	}
	
	public void setLocation(int x, int y){ //sets arangment
	      ray1.setP1(x - 30,y + 70);
	      ray1.setP2(x -90,y + 70);
	      ray2.setP1(x + 120,y + 230);
	      ray2.setP2(x + 120,y + 320);
	      ray3.setP1(x - 30,y + 120);
	      ray3.setP2(x - 130,y + 140);
	      ray4.setP1(x - 20,y + 170);
	      ray4.setP2(x -100,y + 210);
	      ray5.setP1(x + 0,y + 200);
	      ray5.setP2(x - 40,y + 245);
	      ray6.setP1(x + 30,y + 220);
	      ray6.setP2(x + 0,y + 300);
	      ray7.setP1(x + 70,y + 230);
	      ray7.setP2(x + 60,y + 290);
		 }
	
	public Color getColor(){
        return ray1.getColor();
    }
    public void setColor(Color color){
        ray1.setColor(color);
        ray2.setColor(color);
        ray3.setColor(color);
        ray4.setColor(color);
        ray5.setColor(color);
        ray6.setColor(color);
        ray7.setColor(color);
        
        
        
    }


}


