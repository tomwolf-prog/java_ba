package ProjectEuler;

public class P2Fibonacci {

	public static void main(String[] args) {
		int fibonacci1 = 1;
		int fibonacci2 = 2;
		int tmp;
		int sum = 0;
		System.out.println(fibonacci1);
		while (fibonacci2<4_000_000) {
			System.out.println(fibonacci2);
			if (fibonacci2%2 == 0) {
				sum += fibonacci2;
			}
			
			tmp = fibonacci2; 
			fibonacci2 += fibonacci1 ;
			fibonacci1 = tmp;
		}
		System.out.println(sum);
	}

}
