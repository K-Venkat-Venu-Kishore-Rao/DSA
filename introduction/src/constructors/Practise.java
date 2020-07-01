package constructors;

class animal{
	
	int age;
	String name;
	
	animal(String name){
		this.name = name;
	}
	
	animal(int age){
		this.age = age;
	}
}

public class Practise{
	public Practise() {
		System.out.println("object is created now");
	}
	public static void main(String[] args) {
		
		animal dog = new animal("husky");
		animal d = new animal(56);
		
		System.out.println(dog.name+" name is and age is"+d.age);
	}
}