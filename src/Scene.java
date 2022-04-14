//Author: Mia Troiano
// prints the image

import wheels.users.Frame;

public class Scene extends Frame{
    
	private flower flower, flower2;
    private bushes bush;
    private grass grasss;
    private sun sunn;
    private sky skyie;
    private cloud clouds, clouds2;
    private Rays ray;
    

    public Scene(){
        //sky
    	skyie = new sky(0,0);
    	//skyie.setLocation(0, 0);
    	//grass
    	grasss = new grass();
        grasss.setLocation(-10, 300);
        //flowers
        flower = new flower();
        flower.setLocation(200,325);
        flower2 = new flower();
        flower2.setLocation(50,325);
        //bush
        bush = new bushes();
        bush.setLocation(500,420);
        //clouds
        clouds = new cloud();
        clouds.setLocation(50, 50);
        clouds2 = new cloud();
        clouds2.setLocation(350, 120);
        //sun
        sunn = new sun(550,-50);
        //sunn.setLocation(550,-50);
        
        ray = new Rays();
        ray.setLocation(550, -50);
        
    }

    public static void main(String[] args){
        new Scene();
    }
    
}



