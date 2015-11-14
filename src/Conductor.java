import java.awt.*;

public class Conductor {
	
	//Attribute of Conductor class
	private Point start;
	
	//Overloaded constructor of Conductor
	public Conductor(Point start){
		this.start = start;
	}
	
	//Draws a conductor
	public void drawConductor(Graphics g){
		g.setColor(new Color (242,121,0));
		g.fillOval(start.getX()+2,start.getY()+2,16,16);
		g.fillRect(start.getX()+8,start.getY()+18,4,2);
		g.setColor(Color.black);
		g.fillOval(start.getX()+6,start.getY()+6,4,4);
		
	}
	
}
