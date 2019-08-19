package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Heltall {

	public static void main(String[] args) {
		String inputTid = showInputDialog("Tid:");
		int tidInt = parseInt(inputTid);
		
		int timer = tidInt/3600;
		int minutt = (tidInt%3600)/60;
		int sekund = (tidInt%3600)%60;
		
		String showText = timer + " timer, " + minutt + " minutter, " + sekund + " sekunder";
		showMessageDialog(null, showText);
		
	}

}
