package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Heltall {
	public static void main(String[] args) {
		String lengdeTxt = showInputDialog("Lengde:");
		String breddeTxt = showInputDialog("Bredde:");

		int lengde = parseInt(lengdeTxt);
		int bredde = parseInt(breddeTxt);
		
		int areal = lengde*bredde;
		
		String utTxt = "Arealet er " + areal + " m2";
		showMessageDialog(null, utTxt);
	}

}
