import java.awt.*;

public class Scoop {
	
	//Attributes starting point(top) and height
	private Point top;
	private int height;
	
	//Overloaded Constructor
	public Scoop(Point top, int height){
		this.top = top;
		this.height = height;
	}
	
	//Draws a Scoop Object
	public void drawScoop(Graphics g){
		g.setColor(Color.black);
			Polygon scoop = new Polygon();
			scoop.addPoint(top.getX(),top.getY());
			scoop.addPoint(top.getX(),top.getY()+height);
			scoop.addPoint(top.getX()-height,top.getY()+height);
			g.fillPolygon(scoop);
		}
	
}
