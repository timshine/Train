import java.awt.*;
public class Cupola {
	
	//Attribute for height, width and starting top left of cupola
	private Point start;
	private int height;
	private int width;
	
	//Overloaded Constructor for Cupola
	public Cupola(Point start, int width, int height){
		this.start = start;
		this.height = height;
		this.width = width;
		
	}
	
	//Draws Cupola Object
	public void drawCupola(Graphics g){
		//Draw Black Rectangle
		g.setColor(Color.black);
		g.fillRect(start.getX(), start.getY(), width, height);
		
		//Draw Raised part of train that connects to cupola
		g.setColor(Color.red);
		g.fillRect(start.getX()+5,start.getY()+height, width - 10, 25);
	}
}
