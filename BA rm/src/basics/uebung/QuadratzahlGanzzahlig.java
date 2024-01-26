package basics.uebung;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadratzahlGanzzahlig {

	public static void main(String[] args) {
		boolean exit = false;
		do{
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie einen ganzzahligen Zahlenwert zum Quadrieren ein: ");
		int wert = sc.nextInt();
		System.out.println("Die Quadrierte Zahl entspricht " + square(wert));
		} catch (InputMismatchException e) {
			System.out.println("Bitte geben Sie einen ganzzahligen Zahlenwert ein!");
		}
		} while (!exit);
	}
	public static int square(int a) {
		return a * a;
	}

}
