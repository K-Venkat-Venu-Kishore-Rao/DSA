package oops.interfaces;

public  abstract class Person implements YouTuber , Student{
	public static void main(String[] args) {
		
		Person obj = new Person();
		Person obj2 = new Person();
		obj.study();
		obj.makeVideo();
		
		
	}

	@Override
	public void makeVideo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uploadVideo() {
		// TODO Auto-generated method stub
		
	}
	
	
}