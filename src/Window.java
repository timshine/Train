import java.awt.*;
public class Window {

	//Attribute for upper left side of window
	private Point start;

	//Overloaded Constructor
	public Window(Point start){
		this.start = start;
	}
	
	//Draws a Window Object
	public void drawWindow(Graphics g){
		g.setColor(Color.white);
		g.fillRect(start.getX(), start.getY(), 20, 20);
	}
}
