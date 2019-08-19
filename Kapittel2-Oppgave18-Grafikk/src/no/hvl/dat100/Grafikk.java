package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

import easygraphics.*;

public class Grafikk extends EasyGraphics {

	public static void main(String[] args) {
	    launch(args);
	  }
	
	public void run() {
	    makeWindow("Kjønnsfordeling i klasssen", 450, 450);
		
	    //A
	    setColor(0, 255, 0);
	    fillRectangle(50, 50, 98, 50);
	    setColor(0,0,0);
	    drawRectangle(50, 50, 98, 50);
	    
	    setColor(255, 0, 0);
	    fillRectangle(98, 50, 252, 50);
	    setColor(0,0,0);
	    drawRectangle(98, 50, 252, 50);
	    
	    //B
	    setColor(0, 255, 0);
	    fillRectangle(50, 150, 133, 50);
	    setColor(0,0,0);
	    drawRectangle(50, 150, 133, 50);
	    
	    setColor(255, 0, 0);
	    fillRectangle(133, 150, 217, 50);
	    setColor(0,0,0);
	    drawRectangle(133, 150, 217, 50);
	    
	    //C
	    setColor(0, 255, 0);
	    fillRectangle(50, 250, 161, 50);
	    setColor(0,0,0);
	    drawRectangle(50, 250, 161, 50);
	    
	    setColor(255, 0, 0);
	    fillRectangle(161, 250, 189, 50);
	    setColor(0,0,0);
	    drawRectangle(161, 250, 189, 50);
	    
	 }
	
}
