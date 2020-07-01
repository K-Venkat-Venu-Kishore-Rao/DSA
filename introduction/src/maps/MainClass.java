package maps;
import java.util.Map;

import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		
		Map<String, Integer> numbers = new HashMap<>();
		
		numbers.put("one",1);
		numbers.put("two",2);
		numbers.put("five",5);
		
//		numbers.putIfAbsent("one",10);
		
		
//		System.out.println(numbers.getOrDefault("one",100));
//		System.out.println(numbers.containsKey("one"));
		System.out.println(numbers.containsValue(10));
		
//		numbers.replace("one", 11);
		System.out.println(numbers.replace("one", 1, 12));
		
		System.out.println(numbers.keySet());
		System.out.println(numbers.values());
		System.out.println(numbers.entrySet());
		
		
	}

}
