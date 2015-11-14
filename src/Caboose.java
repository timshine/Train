import java.awt.*;

public class Caboose extends Train{
	
	//Caboose Attributes
	private Window window1, window2;
	private Cupola cupola;
	
	
	//Overloaded Constructor sends attributes to super
	public Caboose(Point start, int height, int width, Color trainColor, Point startWindow1, Point startWindow2, Point startCupola, int cupolaWidth, int cupolaHeight){
		
		//Sends parameters to train class
		super(start,height,width,trainColor);
		
		//Sends parameters to objects
		window1 = new Window(startWindow1);
		window2 = new Window(startWindow2);
		cupola = new Cupola(startCupola, cupolaWidth, cupolaHeight);
	}
	
	//Draws Caboose
	public void drawCaboose(Graphics g){
		drawTrain(g);
		window1.drawWindow(g);
		window2.drawWindow(g);
		cupola.drawCupola(g);
	}
	
}
