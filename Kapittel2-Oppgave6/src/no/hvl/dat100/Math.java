package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Math {

	public static void main(String[] args) {
		
		String tallTxt = showInputDialog("Tall 1:");
		String tall2Txt = showInputDialog("Tall 2:");
		String tall3Txt = showInputDialog("Tall 3:");
		String tall4Txt = showInputDialog("Tall 4:");
		
		int tall = parseInt(tallTxt);
		int tall2 = parseInt(tall2Txt);
		int tall3 = parseInt(tall3Txt);
		int tall4 = parseInt(tall4Txt);

		int minsteTallA = min(min(tall, tall2), min(tall3, tall4));
		
		String showText = "Det minste tallet var " + minsteTallA;
		showMessageDialog(null, showText);
	}

}
