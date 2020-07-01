package oops.abstraction;

public class RepairShop{
	
	public  static void RepairCar(Car car) {
		System.out.println("car is repairing");
	}
	
//	public static  void RepairCar(Audi Car) {
//		System.out.println("car is repairing");
//	}
	
	public static void main(String[] args) {
		
//		Car car = new Car();(e.g cannot make car object because car is abstarct form);
		WagonR wagonR = new WagonR();
		Audi audi = new Audi();
		
		RepairCar(wagonR);
		RepairCar(audi);
		
		
		
	}
}