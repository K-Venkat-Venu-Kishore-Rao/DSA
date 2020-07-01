package list.ArrayList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class MethodsOfArrayList{
	public static  void main(String[] args) {
		
		ArrayList fruits = new ArrayList();
		List vegetables = new LinkedList();
		
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("hi");
	
//		List<String> toRemove = new LinkedList<>();
//		toRemove.add("Apple");
//		toRemove.add("hi");
//		
//		fruits.removeAll(toRemove);
//		System.out.println(fruits);
		
		String temp[] = new String[fruits.size()];
		fruits.toArray(temp);
		
		for(String e:temp) {
			System.out.println(e);
		}
	
		
	}
}