package strings;

public class Anagram3 {

	public static void main(String[] args) {
		
		String a = "abbac";
		String b = "abbac";
		boolean isAnagram =true;
		
		int A[] = new int[256];
		int B[] = new int[256];
		
		for(char c: a.toCharArray()) {
			int index =(int) c;
			A[index]++;
		}
		
		for(char c: b.toCharArray()) {
			int index = (int) c;
			A[index]--;
		}
		
		for(int i=0; i<256; i++) {
			if(A[i] != 0) {
			isAnagram = false;
			break;
		}
				
	}
		if(isAnagram) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}
		}
}
