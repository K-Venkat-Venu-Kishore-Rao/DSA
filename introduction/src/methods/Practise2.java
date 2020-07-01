package methods;

public class Practise2{
	public static void main(String[] args) {
		sayHi();
		int a = 65;
		int b = 45;
		int result = maxOf( a, b);
		System.out.println(result);
		
		
		
		int c=45;
		int d=98;
		int e=78;
		int result2 = maxOf(c,d,e);
		System.out.println(result2);
	}
	
	
	static int maxOf(int a, int b) {
			if(a>b) {
				return a;
			}else {
				return b;
			}
	}
	
	
	static void sayHi() {
		System.out.println("hi my name is anuj ");
	}
	
	static int maxOf(int c, int d, int e) {
		if(c>d) {
			return c;
		}else if(d>e) {
			return d;
		}else {
			return e;
		}
	}
}