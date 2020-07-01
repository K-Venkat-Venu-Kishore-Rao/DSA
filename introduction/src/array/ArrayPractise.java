package array;

public class ArrayPractise{
	public static void main(String[] args) {
		
		String a = "aab";
		String b = "aba";
		
		boolean isAnagram =  true;
	
		

		
		int A[] = new int[256];
		int B[] = new int[256];
		
		for(char c: a.toCharArray()) {
			int index = (int)c;
			A[index]++;
			}
		
		
		for(char c : b.toCharArray()) {
			int index =(int)c;
			A[index]--;
		}
		
		for(int i=0; i<256; i++) {
			
			if(A[i]!=B[i]) {
				isAnagram = false;
				break;
				
			}
		}
		if(isAnagram) {
			System.out.println("Anagram");
		}else {
			System.out.println("no  anagram");
		}
	}
}
