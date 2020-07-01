package methods;

public class Practise3PassByValue{
	public static void main(String[] args) {
		int c = 45;
		int d = 6;
		int result = swap(c,d);
		System.out.println(c+" "+d);
		
	}
	
	static int swap(int a, int b) {
			int temp = a;
			a=b;
			b=temp;
		System.out.println(a);
		return a;
	}
	
}