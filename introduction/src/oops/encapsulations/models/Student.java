package oops.encapsulations.models;

public class Student{
	
	private String name;
	public Student(String name) {
		study();
		
		this.name = name;
	}
	
	
	 private void study() {
		System.out.println("I am learning java ");
	}
	
	
	
}