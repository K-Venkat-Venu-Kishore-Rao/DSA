package maps;

public class MainClass2 {

	public static void main(String[] args) {
		
		System.out.println(getHash("CAT"));
		System.out.println(getHash("DOG"));
		System.out.println(getHash("BALL"));
		System.out.println(getHash("GOD"));
	}
	
	public static int getHash(String s) {
		int hash = 0;
		for(int i=0; i < s.length(); i++) {
			hash += s.charAt(i);
		}
		return hash;
	}
	


}
