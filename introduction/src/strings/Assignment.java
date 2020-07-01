package strings;

public class Assignment {

	public static void main(String[] args) {
	
		String a = "I love Java , the cofee";
		String b = "cofee the java , love I ";
		
		String name[] = a.split(",");
		String name2[] = b.split(",");
		
		for(String e:name2) {
			System.out.println(e+"  ");
		}
	}

}
