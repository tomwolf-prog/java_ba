package basics.uebung;
import java.util.Scanner;

public class QuadratzahlFließkomma {

	public static void main(String[] args) {
		
		System.out.println("Programmstart - zum Beenden \"Exit\" eingeben");
		String eingabe = null; //Eingabe innerhalb catch-Block zu sehen
		Scanner sc = new Scanner(System.in);
		
		while (true){ // Endlosschleife bis "System.exit(0);"
			try {
				
				// Eingabe
				System.out.print("Geben Sie einen Wert zum Quadrieren ein: ");
				eingabe = sc.next();
				
				// Beenden des Programms bei Eingabe von Exit/exit
				if (eingabe.equalsIgnoreCase("exit")) {
					System.out.println("Programm wurde beendet!");
					System.exit(0);
				}
				
				// "," wird zu ".", damit float
				String eingabeFloat = eingabe.replaceAll(",", ".");
				
				// Verarbeitung und Ausgabe
				System.out.println("Die Quadrierte Zahl entspricht " + square(Float.parseFloat(eingabeFloat)));
			
			} catch (NumberFormatException e) {
				System.out.println("Die Eingabe \""+eingabe+"\" entspricht weder einem Zahlenwert, noch der Anweisung \"Exit\"!");
	//			System.out.println("Fehlermeldung: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Fehlermeldung: " + e.getMessage());
			}
		}
	}
	
	public static float square(float a) {
		return a * a;
	}

}
