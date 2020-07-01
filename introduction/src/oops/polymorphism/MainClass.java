package oops.polymorphism;

public class MainClass{
	public static void main(String[] args){
		
		Dog d = new Dog();
		
		Pet p = d;
		
		Animal a = (Animal)d;
		
		d.walk();
		p.walk();
		d.name = "husky";
		p.name = "mike";
		
		System.out.println(p.name+" ");
		greetings();
		greetings("hello" ,5);
		
	}
	
		public static void greetings() {
			System.out.println("hi");
		}
		 
		public static void greetings(String s , int count) {
			for(int i=0 ; i<=count; i++) {
			System.out.println("hi"+i);
		}
		
		} 
		
	
	
}