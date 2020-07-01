package list.queue;

public class MainClass<E>{
	public static void main(String[] args) {
		
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(46);
		mq.enqueue(79);
		mq.enqueue(56);
		mq.enqueue(478);
		
		
		System.out.println(mq.dequeue());
	}
}