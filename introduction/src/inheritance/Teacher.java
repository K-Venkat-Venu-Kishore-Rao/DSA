package inheritance;

public class  Teacher extends Person{
	
	public Teacher(String name) {
		super(name);
		System.out.println("inside Teacher constructors");
	}
	
	public void teach() {
		System.out.println(name+"teacher is teaching");
	}
	
	
	public void eat() {
		super.eat();
		System.out.println(name+  " is eating");
	}
	
	
	
}