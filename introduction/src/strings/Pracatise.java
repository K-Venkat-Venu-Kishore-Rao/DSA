package strings;

public class Pracatise{
	public static void main(String[] args) {
		
		
		String a = "ajkkdl";
		String b = "kklaj";
		
		boolean isAnagram = true;
		
		
		int A[] = new int[256];
		for(char c: a.toCharArray()) {
			int index = c;
			A[index]++;
		}
		
		for(char c: b.toCharArray()) {
			int index = c;
			A[index]--;
		}
		
		for(int i=0; i<256; i++) {
			if(A[i] != 0) {
			isAnagram = false;
			break;
		}
		}
		if(isAnagram) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		}
		
	}
