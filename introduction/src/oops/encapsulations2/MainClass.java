package oops.encapsulations2;

public class MainClass{
	public static void main(String[] args) {
		
		
		Student s1 = new Student();
//		s1.age = 45;
//		s1.name = "Harry";
//		System.out.println(s1.name+ " and " +s1.age);
		
		
		s1.setAge(45);
		System.out.println(s1.getAge(45));
		
		s1.setName("anuj");
		System.out.println(s1.getName("anuj"));
	}
	
}