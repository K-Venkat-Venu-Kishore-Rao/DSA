package list.vectosAndStack;

import java.util.Stack;

public class MethodsOfStack{
	public static  void main(String[] args) {
		
		Stack<Integer> stack = new Stack();
		
		stack.push(25);
		stack.push(2265);
		stack.push(487);
		
		int popped = stack.pop();
		System.out.println(popped);
		
		popped = stack.pop();
		System.out.println(popped);
		
		int peeked = stack.peek();
		System.out.println(peeked);
		
		
	}
	
}