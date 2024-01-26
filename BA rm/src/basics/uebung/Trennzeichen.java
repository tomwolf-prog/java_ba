package basics.uebung;

import java.util.Iterator;

public class Trennzeichen {

	public static void main(String[] args) {
		String zeichenkette = "412345678901234";
		String ausgabe = "";
		int count = 0;
		for (int i = zeichenkette.length()-1; i >= 0; i--) {
			char character = zeichenkette.charAt(i);
			if(count == 3) {
				count = 1;
				ausgabe = character+"."+ ausgabe;
				//continue;
			} else {
				ausgabe = character + ausgabe;
				count++;
			}
			
		}
		System.out.println(ausgabe);
		int zlen = zeichenkette.length();
		for (int i = zlen % 3; i <=zlen; i+=3) {
			for (int j = 0; j < args.length; j++) {
				
			}
		}
		
	}
	
	

}
