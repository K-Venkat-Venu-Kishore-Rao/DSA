package maps;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySet {

	public static void main(String[] args) {
		Map<String,Integer> numbers = new HashMap<>();
		
		numbers.put("one",1);
		numbers.put("two",2);
		numbers.put("five",5);
		
		Set<Entry<String,Integer>> entries = numbers.entrySet();
		
//		System.out.println(numbers.entrySet());
		
		for(Entry<String,Integer> entry:entries) {
			entry.setValue(entry.getValue()*100);
		}
		System.out.println(numbers);
	}

}
