import java.awt.*;

public class Funnel {
	
	//Attribute of bottom left point on funnel
	private Point bL;
	
	//Overloaded Constructor for Funnel
	public Funnel(Point bL){
		this.bL = bL;
		
	}
	
	//Draws the Funnel Object
	public void drawFunnel(Graphics g){
		g.setColor(Color.black);
		Polygon scoop = new Polygon();
		scoop.addPoint(bL.getX(),bL.getY());//Bottom Left Point
		scoop.addPoint(bL.getX(),bL.getY()-15);
		scoop.addPoint(bL.getX()-10,bL.getY()-26);
		scoop.addPoint(bL.getX()-10,bL.getY()-30); //Top Left Point
		scoop.addPoint(bL.getX()+20,bL.getY()-30);
		scoop.addPoint(bL.getX()+20,bL.getY()-26);
		scoop.addPoint(bL.getX()+10,bL.getY()-15);
		scoop.addPoint(bL.getX()+10,bL.getY());
		g.fillPolygon(scoop);
		}
	
}

