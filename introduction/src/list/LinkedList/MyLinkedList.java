package list.LinkedList;

public class MyLinkedList<E>{
	Node<E> head;
	
	public void add(E data) {
		Node<E> toAdd = new Node (data);
		
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