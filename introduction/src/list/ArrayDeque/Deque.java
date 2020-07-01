package list.ArrayDeque;

import java.util.*;

public class Deque{
	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.push(45);
		ad.push(78);
		ad.push(440);
		ad.push(783);
		
		
	     System.out.println(ad.pop());
		System.out.println(ad.element());
	}
}