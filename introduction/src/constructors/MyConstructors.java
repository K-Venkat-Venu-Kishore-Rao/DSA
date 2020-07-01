package constructors;


 class vehicle {
	 int wheels;
	 int wheels1;
	vehicle(int noOfWheels){
		wheels = noOfWheels;
		wheels1 = noOfWheels;
	}
}
public class MyConstructors {
	MyConstructors(){
		System.out.println("object is created now: ");
	}
	 
	public static void main(String[] args) {
		MyConstructors obj = new MyConstructors();
		
		vehicle car = new vehicle(4);
		vehicle car2 = new vehicle(4);
		vehicle scooty = new vehicle(2);
		
		System.out.println(car.wheels1+" wheels");
		
	}

}
