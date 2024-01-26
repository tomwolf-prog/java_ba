package basics.uebung;

import java.util.Arrays;

public class Durchschnitt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] myCharArray = {'H', 'a', 'l', 'l', 'o'};
		System.out.println();
		System.out.println(myCharArray);
		System.out.println(myCharArray.toString());
		String t = myCharArray.toString();
		System.out.println(t);
		
		
//		int[] myIntArray = {1, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70};
//		double durchschnitt = average(myIntArray);
//		System.out.println("Der Durchschnitt des Arrays ist: " + durchschnitt);
//		System.out.print("Werte über dem Durchschnitt: ");
//		displayIntArray(intAboveAverage(myIntArray));
//		System.out.print("Ausgabe der 2. Möglichkeit: ");
//		displayAboveArray(myIntArray);
	}
	
	public static double average(int[] myIntArray) {
		int summe = 0;
		for (int i: myIntArray) 
			summe += i;
		return summe / myIntArray.length;
	}
	
	public static void displayAboveArray(int[] myIntArray) {
		double average = average(myIntArray);
		int count = 0;
		for (int i : myIntArray) {
			if (i > average) {
				if(count == myIntArray.length-1) {
					System.out.println(i);
					return;
				}
				System.out.print(i+", ");
			}
			count++;
		}
	}
	
	public static int[] intAboveAverage(int[] myIntArray) {
		double average = average(myIntArray);
		int[] aboveAverage = new int[0];
		for (int i : myIntArray) {
			if (i > average) {
				aboveAverage = Arrays.copyOf(aboveAverage, aboveAverage.length+1);
				aboveAverage[aboveAverage.length-1] = i;
			}
		}
		return aboveAverage;
	}
	
	public static void displayIntArray(int[] myIntArray) {
		
//		System.out.println(myIntArray);
		
		//System.out.println(myIntArray.toString());
		System.out.print(Arrays.toString(myIntArray));
		
		
		
		for(int i = 0; i < myIntArray.length; i++ ) {
			
			if (i != myIntArray.length-1) {
				System.out.print(myIntArray[i]+", ");
			} else {
				System.out.println(myIntArray[i]);
			}
			
//			if(i == myIntArray.length-1) {
//				System.out.println(myIntArray[i]);
//				return;
//			}
//			System.out.print(myIntArray[i]+", ");
			
		}
		
	}
}
