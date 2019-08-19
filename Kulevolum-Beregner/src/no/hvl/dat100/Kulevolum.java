package no.hvl.dat100;

import static java.lang.Double.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Kulevolum {

	public static void main(String[] args) {
		
		String radius = showInputDialog("Radius:");
		
		double radiusDouble= parseDouble(radius);
		
		double math = 4/3*Math.PI*radiusDouble*radiusDouble*radiusDouble;
		double mathRoundOff = Math.round(math*100.0)/100.0;

		
		String txtOut = "Kulevolumet er " + mathRoundOff + " m^3";
		showMessageDialog(null, txtOut);
	}

}
