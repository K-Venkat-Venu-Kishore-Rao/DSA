package staticKeyword;

public class StaticBlocks{
	
	static {
		System.out.println("in block 1");
	}
	static {
		System.out.println("in block 2");
	}
	static {
		System.out.println("in block 3");
	}
	
	public static void main(String[] args) {
	System.out.println("in block 4");	
	}
	
	static {
		System.out.println("in block 5");
	}
}