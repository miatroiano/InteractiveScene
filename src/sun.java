//Author: Mia Troiano
//creates the sun image
import java.awt.Color;

import wheels.users.*;

public class sun extends PressSun{
	
	
	public sun(int x, int y) {
		
		this.setColor(new Color(233,247,94));
		this.setLocation(x,y);
		this.setSize(140, 140);
		//sets the sizes of sun 
		setSizePressed(200,200);
		setSizeRelease(140, 140);
		setFillColorPressed(new Color(255,174,0));
		setFillColorReleased(new Color(233,247,94));
		
	}
}

