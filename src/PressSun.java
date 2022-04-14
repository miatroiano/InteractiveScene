//Author: Mia Troiano
//changes the size of sun when the sun is pressed 
import java.awt.Color;
import java.awt.event.MouseEvent;

import wheels.users.Ellipse;


public abstract class PressSun extends Ellipse implements color{
	
	private int pressSizex;
	private int pressSizey;
	
	private int releaseSizex;
	private int releaseSizey;
	
	private Color fillColorPressed;
	private Color fillColorReleased;

	
	public PressSun() {
		
		
	}
    
    public void setSizePressed(int sizex, int sizey) {
    	this.pressSizex = sizex;
    	this.pressSizey = sizey;
    	setSize(sizex, sizey);
    }
    public void setSizeRelease(int sizex, int sizey) {
    	this.releaseSizex = sizex;
    	this.releaseSizey = sizey;
    	setSize(sizex, sizey);
    }
    
    //sets the color for when pressed
    public void setFillColorPressed(Color color) {
    	this.fillColorPressed = color;
    	
    	
    }
    //sets the color for when released 
    public void setFillColorReleased(Color color) {
    	this.fillColorReleased = color;
    	
    	
    }
   
    
    
    
	
    public void mousePressed(MouseEvent e)
    {
        this.setSize(pressSizex, pressSizey);
        this.colors(fillColorPressed);
    }
    
    public void mouseReleased(MouseEvent e)
    {
        this.setSize(releaseSizex, releaseSizey);
        this.colors(fillColorReleased);
    }
    public void colors(Color color) {
    	this.setColor(color);
    	
    }
   
    
  
}
