//Author: Mia Troiano
//creates the cloud images
import java.awt.Color;
import wheels.users.*;

public class cloud {
	private Ellipse cloud1,cloud2, cloud3, cloud4, cloud5, cloud6, cloud7, cloud8, cloud9, cloud10;
	
	//sets shape 
	public cloud() {
		
		cloud1 = new Ellipse();
	    
		cloud2 = new Ellipse();
	    
	    cloud3 = new Ellipse();
	    
	    cloud4 = new Ellipse();
	    
	    cloud5 = new Ellipse();
	    
	    cloud6 = new Ellipse();
	    
	    cloud7 = new Ellipse();
	    
	    cloud8 = new Ellipse();
	    
	    cloud9 = new Ellipse();
	   
	    cloud10 = new Ellipse();
	    
	    
	    //sets base location
	    this.setLocation(0, 0);
	    //sets base color 
        this.setColor(new Color(255,255,255));
        //sets base size
        this.setSize(0, 0);
        
		
	}
	//sets size of cloud parts
	public void setSize(int x, int y) {
		 cloud1.setSize(x+130,y +80);
	      cloud2.setSize(x + 80,y + 60);
	      cloud3.setSize(x + 70,y + 85);
	      cloud4.setSize(x + 60,y + 60);
	      cloud5.setSize(x + 60,y + 70);
	      cloud6.setSize(x + 60,y + 60);
	      cloud7.setSize(x + 80,y + 80);
	      cloud8.setSize(x + 60,y + 60);
	      cloud9.setSize(x + 70,y + 50);
	      cloud10.setSize(x + 80,y +60);
	}
	//sets location of all 
	public void setLocation(int x, int y){ 
	      cloud1.setLocation(x,y);
	      cloud2.setLocation(x + 25,y - 25);
	      cloud3.setLocation(x - 25,y + 5);
	      cloud4.setLocation(x + 125,y + 10);
	      cloud5.setLocation(x + 85,y - 15);
	      cloud6.setLocation(x - 5 ,y - 15);
	      cloud7.setLocation(x + 100,y - 15);
	      cloud8.setLocation(x + 10,y + 40);
	      cloud9.setLocation(x + 95,y + 45);
	      cloud10.setLocation(x + 35,y + 45);
	     
		  }
	//gets base color 
	public Color getColor(){
	        return cloud1.getColor();
	    }
	//sets color for all 
	public void setColor(Color color){
	        cloud1.setColor(color);
	        cloud2.setColor(color);
	        cloud3.setColor(color);
	        cloud4.setColor(color);
	        cloud5.setColor(color);
	        cloud6.setColor(color);
	        cloud7.setColor(color);
	        cloud8.setColor(color);
	        cloud9.setColor(color);
	        cloud10.setColor(color);
	        
	    }
}
