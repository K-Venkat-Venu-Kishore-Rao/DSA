package oops.interfaces;

public interface Student{
	
	abstract void study();
	
	 default void uploadVideo() {
		System.out.println("uploading the video");
	}
	
	
}