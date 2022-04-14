//Author: Mia Troiano
// creates the flower images 
import java.awt.Color;
import wheels.users.*;

public class flower {
	
	private Ellipse fcenter;
    private Ellipse petal1, petal2, petal3, petal4, petal5, petal6;
    private Ellipse leaf1, leaf2;
    private Rectangle stem;
    

    public flower()
    {
    	//stem
    	stem = new Rectangle();
        stem.setSize(10,100);
        
        
        //petals
        petal1 = new Ellipse();
        petal1.setSize(40, 40);
       
        petal2 = new Ellipse();
        petal2.setSize(40, 40);
       
        petal3 = new Ellipse();
        petal3.setSize(40, 40);
        
        petal4 = new Ellipse();
        petal4.setSize(40, 40);
        
        petal5 = new Ellipse();
        petal5.setSize(40, 40);
       
        petal6 = new Ellipse();
        petal6.setSize(40, 40);
        
        
        //flower center
        fcenter = new Ellipse();
        fcenter.setSize(35, 35);
        
       
        //leafs
        leaf1 = new Ellipse();
        leaf1.setSize(20,10);
        
        leaf2 = new Ellipse();
        leaf2.setSize(20,10);
        
        //sets base location
        this.setLocation(0, 0);
        //sets base color
        this.setColor(Color.PINK);
       
        
    }
    //sets location to all
    public void setLocation(int x, int y){ 
      petal1.setLocation(x,y);
      fcenter.setLocation(x + 25,y + 27);
      petal2.setLocation(x + 15,y + 55);
      petal3.setLocation(x + 45,y + 50);
      petal4.setLocation(x + 55,y + 20);
      petal5.setLocation(x + 35,y - 5);
      petal6.setLocation(x - 5,y + 35);
      leaf1.setLocation(x + 20, y + 105);
      leaf2.setLocation(x + 45, y + 125);
      stem.setLocation(x + 38, y + 73);
	  }
    
    //gets base color
    public Color getColor(){
        return petal1.getColor();
    }
    
    //sets color to all 
    public void setColor(Color color){
        petal1.setColor(color);
        petal2.setColor(color);
        petal3.setColor(color);
        petal4.setColor(color);
        petal5.setColor(color);
        petal6.setColor(color);
        fcenter.setColor(Color.YELLOW);
        leaf1.setColor(Color.GREEN);
        leaf2.setColor(Color.GREEN);
        stem.setColor(Color.GREEN);
        
        
    }

}


