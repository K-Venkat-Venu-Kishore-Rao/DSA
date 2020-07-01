package oops.finalKeyword;

public class MainClass{
	final int rollNo = 41;
	
	
	
	public void getDescription() {
		System.out.println("hi");
	} 
	
	public static void main(String[] args) {
		
		final int ROLLNO;
		
		System.out.println();
		
		
		final Student obj = new Student();
		Student obj2 = new Student();
		
		  getDescription();
		
		
//		obj = obj2;
		obj.name = "anuj";
		
	}
	
	
	
}