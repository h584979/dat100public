package no.hvl.dat100;

import static java.lang.Integer.min;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Dato {

	public static void main(String[] args) {
		
		String dagNummer = showInputDialog("Dagnummer:");
		String månedNummer = showInputDialog("Månedsnummer:");
		String årNummer = showInputDialog("Årstall:");
		
		int dagInt = parseInt(dagNummer);
		int månedInt = parseInt(månedNummer);
		int årInt = parseInt(årNummer);
		
		String showText = dagInt + "." + månedInt + "." + årInt;
		showMessageDialog(null, showText);
		
	}

}
