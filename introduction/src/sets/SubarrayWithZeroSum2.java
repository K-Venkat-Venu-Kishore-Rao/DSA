package sets;

import java.util.Set;
import java.util.HashSet;

public class SubarrayWithZeroSum2{
	public static void main(String[] args) {
		
		int a[] = {2,1,3,-4,2};
		boolean found = false;
		
		Set<Integer> set = new HashSet<>();
		
		int sum = 0;
		for(int element : a) {
			set.add(sum);
			sum += element;
			if(set.contains(sum)) {
				found = true;
				break;
			}
		}
	}
}