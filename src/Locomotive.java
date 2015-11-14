import java.awt.*;


public class Locomotive extends Train {
	
	//Locomotive Attributes
	private Scoop scoop;
	private Funnel funnel;
	
	//Overloaded Constructor 
	public Locomotive(Point start, int height, int width, Color trainColor, Point startScoop, int scoopHeight, Point startFunnel){
		
		//Sends parameters to train class
		super(start,height,width,trainColor);
		
		//Sends parameters to objects 
		scoop = new Scoop(startScoop, scoopHeight);
		funnel = new Funnel(startFunnel);
		
	}
	
	//Draws Locomotive with scoop and funnel
	public void drawLocomotive(Graphics g){
		drawTrain(g);
		scoop.drawScoop(g);
		funnel.drawFunnel(g);
	}
				
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

