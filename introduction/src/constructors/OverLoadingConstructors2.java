package constructors;

 class vehicle22{
	 int wheels;
	 String color;
	 int headLights;
	vehicle22(){
		
	}
	vehicle22(int wheels){
		this.wheels = wheels;
		headLights = 2;
	}
	vehicle22( int wheels , String color){
		this.wheels = wheels;
		this.color  = color	;
		headLights = 2;
	}
}

public class OverLoadingConstructors2 {
		OverLoadingConstructors2() {
			System.out.println(" object is created now:");
		}
			
		
		
		
		public static void main(String[] args) {
		
			vehicle22 car  = new vehicle22();
			vehicle22 scooty = new vehicle22(4);
			vehicle22 eRicksaw  = new vehicle22(3, "Yellow");
			
			System.out.println(scooty.wheels+" wheels");
			System.out.println(eRicksaw.wheels+" wheels and its color are "+eRicksaw.color);
	}

}
