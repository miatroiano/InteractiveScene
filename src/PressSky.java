//Author: Mia Troiano
//changes color of sky when  sky is pressed 

import java.awt.Color;
import java.awt.event.MouseEvent;

import wheels.users.Rectangle;

import wheels.users.*;
public abstract class PressSky extends Rectangle implements color {
	
	private Color fillColorPressed;
	private Color fillColorReleased;
	//private color colors;
	
	
   
    

	
	public PressSky() {
		
		
	}
    //sets the color for when pressed
    public void setFillColorPressed(Color color) {
    	this.fillColorPressed = color;
    	
    	
    }
    //sets the color for when released 
    public void setFillColorReleased(Color color) {
    	this.fillColorReleased = color;
    	
    	
    }
    
	//sets the color when pressed
    public void mousePressed(MouseEvent e)
    {
    	this.colors(fillColorPressed);
    	
    	
    }
    
    //sets the color when released
    public void mouseReleased(MouseEvent e)
    {
    	
    	this.colors(fillColorPressed);
    }
    public void colors(Color color) {
    	this.setColor(color);
    }
   
   
    
  
}
