package inheritance;

public class Singer extends Person{
	
	public Singer(String name) {
		super(name);
	}

	public void singer() {
		System.out.println(name+"singer is singing");
	}
	
	
	
}