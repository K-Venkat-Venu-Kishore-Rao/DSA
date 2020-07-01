package sets;

import java.util.Set;
import java.util.HashSet;

public class VeinDiagram {

	public static void main(String[] args) {
		
		Set<Integer> x = new HashSet<>();
		
		x.add(23);
		x.add(1);
		x.add(6);
//		x.add(3);
		
		Set<Integer> y = new HashSet<>();
		
		y.add(3);
		y.add(10);
		y.add(6);
		
//		x.addAll(y);
//		x.retainAll(y);
		System.out.println(x.containsAll(y));
		
		System.out.println(x);
		
	}

}
