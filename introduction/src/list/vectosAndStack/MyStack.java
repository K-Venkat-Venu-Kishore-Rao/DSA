package list.vectosAndStack;

import java.util.LinkedList;

public class MyStack<E>{
	
	LinkedList<E> ll = new LinkedList<>();
	
	void push(E e){
		ll.add(e);
	}
	
	E pop() throws Exception{
		if(ll.isEmpty()){
			throw new Exception("cannot popping last element from linkedlist");
		}
		return ll.removeLast();
	}
	
	E peek()  throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("cannot peek last element from linkedlist");
		}
		return ll.getLast();
		
	}
}