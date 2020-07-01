package oops.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		
		
//		try {
//		int a = 5;
//		int b = 0;
//		 int c = a/b;
//		 
//		 System.out.println(c);
//		}catch(ArithmeticException e) {
//			System.out.println(e.getMessage()+ " occured ");
//		}catch(IndexOutOfBoundsException e) {
//			
//		}
//		catch(IllegalArgumentException e) {
//			
//		}finally {
//			System.out.println(" i am beginer");
//		}
//		
//		System.out.println(" very important code");
//		System.out.println("need to run");
//		
//		
		fun1();
		
	}
	
	static void fun1() {
		
		int a = 5;
		int b = 1;
		 int c = a/b;
		 
		 System.out.println(c);
		
		 try {
			 Thread.sleep(3000);
			  fun2();
		 }catch(Exception e) {
			 System.out.println(e.getMessage()+" occuered");
		 }
	
	
	}
	
	static void fun2() {
		System.out.println("all set occurs");
	}
	
	
	
	

}
