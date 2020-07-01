package list.ArrayList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList{
	public static void main(String[] args) {
		
		ArrayList fruits  = new ArrayList();
		List  marks = new LinkedList();
		
		Pair<String, Integer> p1 = new Pair("Anuj" ,457);
		Pair<Boolean, String> p2 = new Pair(true,"anuj");
		
		p1.getDescription();
		p2.getDescription();
		
	}
}