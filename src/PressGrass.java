//Author: Mia Troiano
//changes the location of the grass and adds a new bigger cloud when the mouse is dragged
import java.awt.Color;
import java.awt.event.MouseEvent;

import wheels.users.*;
public class PressGrass extends Ellipse {
	
	private  grass grasss;
	private cloud clouds;
	private int previousmousex;
	private int previousmousey;
	private int xnow;
	private int ynow;
	private int sizeX;
	private int sizeY;
	
	public PressGrass() {
		
		
	}
	
	
	
	public PressGrass(grass grasss) {
		 
		this.grasss = grasss;
		
		
		
	}
	//adds new bigger cloud to scene 
	public void mousePressed(MouseEvent e) {
		previousmousex = e.getX();
		previousmousey = e.getY();
		sizeX = 50;
		sizeY = 30;
		clouds = new cloud();
		clouds.setLocation(250, 10);
		clouds.setSize(sizeX, sizeY);
		
	}
	
	// makes the grass draggable 
	public void mouseDragged(MouseEvent e) {
		
		xnow = e.getX() - previousmousex;
		ynow = e.getY() - previousmousey;
		this.setLocation(this.getXLocation() + xnow, this.getYLocation() + ynow);
		//this.setLocation(e.getX() + xnow, e.getY() + ynow);
		previousmousex = e.getX();
		previousmousey = e.getY();
		
	}
	
	
	
	
	
	
	
	
}
