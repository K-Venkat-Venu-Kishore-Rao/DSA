package list.vectosAndStack;

public class MainClass<E>{
	public static void main(String[] args) throws Exception{
		
		MyStack<Integer> ms = new MyStack<>();
		
		ms.push(45);
		ms.push(45);
		ms.push(78);
		ms.push(46);
		
		int popped = ms.pop();
		System.out.println(popped);
		
		int peeked = ms.peek();
		System.out.println(peeked);
	}
}