//Author: Mia Troiano
//creates the sky
import java.awt.Color;
import wheels.users.*;

public class sky extends PressSky{
	
	
	public sky(int x, int y) {
		this.setLocation(x, y);
		this.setSize(1000,1000);
		this.setColor(new Color(180,240,252));
		//sets sky color
		setFillColorPressed(new Color(15,28,79));
		setFillColorReleased(new Color(180,240,252));
		//sets the size of sky
		setSize(1000, 1000);
	
		
	}

	
	
	
	

}
