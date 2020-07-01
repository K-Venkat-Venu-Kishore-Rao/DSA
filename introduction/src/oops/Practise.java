package oops;

public class Practise{
	public static void main(String[] args) {
		
		int c = 54564145;
		int d= 1265;
		     swap(c,d);
		System.out.println(c+"  "+d);
		
	}
	
	public static void swap(int a , int b) {
		if(b>a) {
		int temp = b; 
		b = a;
		a= temp;
	     }
		System.out.println(a);
	}
	
}