package methods;

public class Introduction {

	public static void main(String[] args) {
		int firstNumber =356;
		int secondNumber =56;
		int result =maxOf(firstNumber , secondNumber);
		
		System.out.println(result);
		sayHi();
		sayHi();
		sayHi();
		
		maxOf(5);
		
		
	}
	
	
	
	static int maxOf(int a , int b) {
		 if(a>b) {
			 return a;
		 }else {
			 return b;
		 }
		 
	}
	
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good Morning");
	}
	
	static float maxOf(float d) {
		return d;
		
	}

}
