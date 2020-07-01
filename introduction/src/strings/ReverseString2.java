package strings;

public class ReverseString2{
	public static void main(String[] args) {
		
		
		String a= "the sky is blue";
		String str[] =a.split(" ");
		
		String str1 = "";
		
		
		for(int i = 0; i<str.length; i++) {
			System.out.print(str[i]+" ");
		}
		
		System.out.println();
		for(int i=str.length- 1; i>=0; i--) {
			System.out.print(str[i]+" ");
		}
		
	}
}