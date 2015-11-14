import java.awt.*;

public class AdvancedLocomotive extends Locomotive{
	
	//Locomotive Attributes
	private Window window;
	private Conductor conductor;
	
	//OverLoaded Constructor
	public AdvancedLocomotive(Point start, int height, int width, Color trainColor, Point startScoop, int scoopHeight, Point startFunnel, Point windowStart){
		
		//Sends parameters to Locomotive Class
		super(start,height,width,trainColor,startScoop,scoopHeight,startFunnel);
		
		//Sends parameters to object
		window = new Window(windowStart);
		conductor = new Conductor(windowStart);
	}
	
	//Draws Advanced Locomotive
	public void drawAdvancedLocomotive(Graphics g){
		drawLocomotive(g);
		window.drawWindow(g);
		conductor.drawConductor(g);
	}
}
