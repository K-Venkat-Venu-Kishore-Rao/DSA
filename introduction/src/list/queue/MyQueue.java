package list.queue;

public class MyQueue<E>{
	Node<E> head , rear;
	
	public void enqueue(E e) {
		Node<E> toAdd = new Node<>(e);
		if(head == null) {
			head = rear = toAdd;
		}
		
		rear.next = toAdd;
		rear = rear.next;
		
		
	}
	
	public E dequeue() {
		if(head == null) {
			return null;
		}
		
	    Node<E> temp = head;
		 head = head.next;
		 return temp.data;
     }
		
		static class Node<E>{
			E data;
			Node<E> next;
			
			public Node(E data) {
				this.data = data;
				this.next = null;
			}
		}
}