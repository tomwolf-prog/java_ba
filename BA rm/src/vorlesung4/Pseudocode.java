package vorlesung4;

public class Pseudocode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pseudocode pc = new Pseudocode();
		String wort = "Algengrütze";
		int positionE = pc.findeE(wort);
		int positionE2 = pc.findeE2(wort);
		System.out.println("Das erste e war an Position " + positionE);
		System.out.println("Das erste e war an Position " + positionE2);
	}

	private int findeE(String wort) {
		for (int i = 1; i <= wort.length(); i++) {
			char character = wort.charAt(i-1);
			if (character == 'e') {
				return i;
			}
		}
		return -1;
	}
	private int findeE2(String wort) {
		for (int i = 0; i < wort.length(); i++) {
			char character = wort.charAt(i);
			if (character == 'e') {
				return i+1;
			}
		}
		return -1;
	}
	
}
