package oops;

class dog{
	String name , breed;
	int legs ,eyes ;

 	public void walk() {
 		System.out.println(" my dog name is " +name+  " and its breed is " +breed);
 	}
 	public void description() {
 		System.out.println(" my dogs legs are " +legs+ " AND ITS EYES ARE " +eyes);
 	}
}
 	public class MainClass2 {

	public static void main(String[] args) {
		dog dog1 = new dog();
		dog dog2 = new dog();
		
		dog1.name = "husky";
		dog2.name= "browny";
		
		dog1.legs=4;
		dog2.legs=4;
		
		dog1.eyes = 2;
		dog2.eyes = 2;
		
		dog1.walk();
		dog1.description();
		
		dog2.walk();
		dog2.description();
		
	}

}
