package vorlesung5;

public class SummeBis {

	public static void main(String[] args) {
		int summe = sumN(10);
		System.out.println("Summe von 10 = " + summe);
	}
	private static int sumN(int n) {
		if (n==0) {
			return 0;
		} else {
			return sumN(n-1) + n;
		}
	}

}
