package ProjectEuler;

public class P3PrimeFactor {

	public static void main(String[] args) {
//		long zahl = 600851475143L;
		int zahl = 12;
		
		while(zahl%2==0)
			zahl/=2;
			
//		outerloop:
		for(int i=3; i <= zahl; i+=2) {
//			for(int j=2; j<8 && j<i; j++) {
//				if(i%j==0) {
//					continue outerloop;
//				}
//					
//			}
			while(zahl%i==0) {
				zahl/=i;
				//System.out.print(i + ", ");
				if(zahl==1) {
					System.out.print(i);
//					break outerloop;
				} else {
					System.out.print(i + ", ");
				}
					
			}
		}
	}
}
