package list.LinkedList;

public class LinkedList<E>{
	Node<E> head;
	
	public void add(E e) {
		Node<E> toAdd = new Node<>(e);
		
		if(isEmpty()) {
			 head = toAdd;
			 return;
		}
		
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
			temp.next = toAdd;
		
	}
	
	public E removeLast() throws Exception{
		Node<E> temp = head;
		if(head == null) {
			throw new Exception("cannot popping last element from linkedlsit");
 		}
		
		if(temp.next == null) {
			Node<E> toRemove = head;
			head = null;
			return toRemove.data;
		}
		
		while(temp.next.next != null) {
			temp = temp.next;
		}
			
		Node<E> toRemove = head;
		head.next = head;
		return toRemove.data;
	}
	
	public E getLast() throws Exception{
		Node<E> temp = head;
		if(head == null) {
			throw new Exception("cannot peeking last element from linkedlist");
		}
		
		
		while(temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	
	
	
		void print() {
			Node<E> temp = head;
			while(temp != null) {
				System.out.println(temp.data+" ");
				temp = temp.next;
			}
		}
	
		boolean isEmpty() {
			return head == null;
		}
	
	
	static class Node<E>{
		E data;
		Node<E> next;
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}
}