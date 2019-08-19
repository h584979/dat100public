package no.hvl.dat100;

import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;


public class Oppg1momsberegning {

	public static void main(String[] args) {
		
		String readValue = showInputDialog("Beløp:");
		
		double value = parseDouble(readValue);
		double valueMVA = value/4;
		double endValue = value+valueMVA;
		
		double valueRoundOff = Math.round(value*100.0)/100.0;
		double valueMVARoundOff = Math.round(valueMVA*100.0)/100.0;
		double endValueRoundOff = Math.round(endValue*100.0)/100.0;

		
		String receipt = "Beløp: " + valueRoundOff + "\n" + "Moms (MVA): " + valueMVARoundOff + "\n" + "Totalpris: " + endValueRoundOff;
		showMessageDialog(null, receipt);
		
	}
}
