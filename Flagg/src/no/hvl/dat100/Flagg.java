package no.hvl.dat100;

import easygraphics.*;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Flagg extends EasyGraphics {

	public static void main(String[] args) {
	    launch(args);
	  }

	  public void run() {
		makeWindow("Det tyske flagget", 450, 450);
		
		String prosent = getText("Prosentverdi:");
		int prosentInt = parseInt(prosent);
		
		int breddeDefault = 300, hoydeDefault = 66;
		int bredde = breddeDefault*prosentInt/100;
		int hoyde = hoydeDefault*prosentInt/100;
				
    
	    setColor(0, 0, 0);
	    fillRectangle(50, 50, bredde, hoyde);
	    
	    setColor(221, 0, 0);
	    fillRectangle(50, 50 + hoyde, bredde, hoyde);
	    
	    setColor(255, 206, 0);
	    fillRectangle(50, 50 + hoyde*2, bredde, hoyde);
	  }

}
