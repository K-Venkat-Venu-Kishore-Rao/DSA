package staticKeyword;

public class Practise{
	
	static {
		System.out.println(" in block 1 ");
	}
	
	static {
		System.out.println(" in block 2 ");
	}

	static{
		System.out.println(" in block 3 ");
	}
	
	public static void main(String[] args) {
		System.out.println(" inside main ");
	}
	
	static {
		System.out.println(" in block 4 ");
	}
	
}