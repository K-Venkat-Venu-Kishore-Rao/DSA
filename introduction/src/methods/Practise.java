package methods;

public class Practise {

	public static void main(String[] args) {
		int firstNumber = 34;
		int secondNumber =45;
		int result = maxOf(firstNumber , secondNumber);
		
		maxOf(100 ,256);
		maxOf(256, 24);
		int resuklt2 = maxOf(100 , 256);
		System.out.println(resuklt2);
		
		System.out.println(result);
		
		
	}
	
	static int maxOf(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
}
		
		
		
		