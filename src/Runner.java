/*
 * Timothy Shine
 * Class Interaction Lab
 * 13 November 2015
 */

import java.awt.*;
import java.applet.*;

public class Runner extends Applet{
	
	//Sets Applet Size
	public void init(){
		setSize(900,550);
	}
	
	//Draws the Full Train with the Train Cars, Locomotive and Caboose
	public void paint(Graphics g){
		TrainFull train = new TrainFull();
		train.drawFullTrain(g);
			
	}

}
