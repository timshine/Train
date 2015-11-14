import java.awt.*;

public class TrainFull {
	
	//Default Constructor to make object
	public TrainFull(){
			
	}
		//Draws the Full Train
		public void drawFullTrain(Graphics g){
			
			//Draws Locomotive
			Point first = new Point(50,200);
			Point scoopStart = new Point(first.getX(),first.getY()+38); //Scoop
			Point startFunnel = new Point(first.getX()+15,first.getY()); //Funnel
			Point startWindow = new Point(first.getX()+15,first.getY()+15); //Window
			AdvancedLocomotive train1 = new AdvancedLocomotive(first,75,125,Color.blue,scoopStart,37,startFunnel,startWindow);
			train1.drawAdvancedLocomotive(g);
			
			//Draws Train Car
			Point second = new Point(185,200);
			Train train2 = new Train(second,75,125,Color.green);
			train2.drawTrain(g);
			
			//Draws Train Car
			Point third = new Point(320,200);
			Train train3 = new Train(third,75,125,Color.yellow);
			train3.drawTrain(g);
			
			//Draws Train Car
			Point fourth = new Point(455,200);
			Train train4 = new Train(fourth,75,125,Color.magenta);
			train4.drawTrain(g);
			
			//Draws Train Car
			Point fifth = new Point(590,200);
			Train train5 = new Train(fifth,75,125,Color.cyan);
			train5.drawTrain(g);
			
			//Draws Caboose
			Point sixth = new Point(725,200);
			Point window1 = new Point(sixth.getX()+30,sixth.getY()+25); //Front Window
			Point window2 = new Point(sixth.getX()+75,sixth.getY()+25); //Back Window
			Point cupolaStart = new Point(sixth.getX()+35,sixth.getY()-10); //Cupola
			Caboose train6 = new Caboose(sixth,75,125,Color.red,window1,window2, cupolaStart,55,3);
			train6.drawCaboose(g);
		}
	}

