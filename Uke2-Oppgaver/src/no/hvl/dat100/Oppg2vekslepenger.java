package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppg2vekslepenger {

	public static void main(String[] args) {
		
		String pris = showInputDialog("Pris:");
		String betalt = showInputDialog("Betalt:");
		
		int prisInt = parseInt(pris);
		int betaltInt = parseInt(betalt);
		
		if (prisInt>betaltInt) {
			String outText = "Du har betalt mindre enn hva varen koster.";
			showMessageDialog(null, outText);
		}
		else {
			int sum = betaltInt-prisInt;
			int tikroner = sum/10;
			int enkroner = (sum%10);
			
			String outText = tikroner + " 10-kronere" + "\n" + enkroner + " 1-kronere";
			showMessageDialog(null, outText);
		}
		
	}

}
