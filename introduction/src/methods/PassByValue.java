package methods;
class dog{
	String name , breed;
	
	
	public void name() {
		System.out.println(" her name is hrsy:");
	}
	
	public void breed() {
		System.out.println(" her breed is lambh:");
	}
	}

public class PassByValue{
public static void main(String[] args) {
	
	sayHi();
	dog dog1 = new dog();
	
	dog1.name();
	dog1.breed();
	
	int c = 64;
	int d = 4;
	 swap( c,  d);
	 System.out.println(c+"  "+d);
	
}


	static void swap(int a, int b) {
		int temp = b;
		a = b;
		a = temp;
		System.out.println(a);
		  
	}
	
	
	static void sayHi() {
		System.out.println("hi my name is:");
	}
}