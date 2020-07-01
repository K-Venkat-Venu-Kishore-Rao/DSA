package oops.encapsulations2;


public class Student{
	
	private String name;
	private int age;
	
	
	public int getAge(int age) {
		return age;
	}
	
	public void setAge(int age) {
		if(age > 20) {
			System.out.println("you are too older for my nursery school");
		}else {
			this.age = age;
		}
	}
	
	public String getName(String name) {
		return name;
	}
	
	public void setName(String name) {
		if(name.length() > 5) {
			System.out.println("your name is too long");
		}else {
			this.name = name;
		}
	}

}
