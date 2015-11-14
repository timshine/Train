
import java.awt.*;


public class Train{
	//Class Attributes
	private Point start;
	private int height;
	private int width; 
	private Color trainColor;
	
	//Default Constructor
	public Train(){
		start = new Point(10,10);
		height = 75;
		width = 125;
		trainColor = Color.blue;
	}
	
	//Overloaded Constructor
	public Train(Point start, int height, int width, Color trainColor){
		this.start = start;
		this.height = height;
		this.width = width;
		this.trainColor = trainColor;
	}
	
	
	//Get Methods
	public Point getStart()   { return start;  }
  	public int getHeight()    { return height; }
  	public int getWidth()     { return width;  }
  	public Color getColor()   { return trainColor; 
  	}
  	
  	
  	//Set Methods
  	public void setStart(Point tP)    { start = tP;  }
  	public void setHeight(int tH)     { height = tH; }
  	public void setWidth(int tW)     { width = tW;  }
  	public void setColor(Color tC)  { trainColor = tC;  }
  	
  	
  	//Draw Train
  	public void drawTrain(Graphics g)
  	{
     	g.setColor(trainColor);
     	g.fillRect(start.getX(),start.getY(),width,height);
     	g.setColor(Color.black);
     	g.fillOval(start.getX()+10,start.getY()+height-20, 40,40);
     	g.fillOval(start.getX()+width -50,start.getY()+height-20,40,40);
     		
  	}
  	
  		
}
