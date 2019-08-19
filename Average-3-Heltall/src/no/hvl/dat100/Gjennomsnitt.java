package no.hvl.dat100;

import static java.lang.Integer.min;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Gjennomsnitt {

	public static void main(String[] args) {
		
		String tallTxt = showInputDialog("Tall 1:");
		String tall2Txt = showInputDialog("Tall 2:");
		String tall3Txt = showInputDialog("Tall 3:");
		
		int tall = parseInt(tallTxt);
		int tall2 = parseInt(tall2Txt);
		int tall3 = parseInt(tall3Txt);

		int summer = tall+tall2+tall3;
		int gjennomsnitt = summer/3;
		
		String showText = "Gjennomsnittet er " + gjennomsnitt;
		showMessageDialog(null, showText);
	}

}
