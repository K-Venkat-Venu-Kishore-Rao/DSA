package oops.interfaces;

public abstract interface YouTuber extends VideoeEditor{
	
	abstract void makeVideo() ;
	
	
	 default void uploadVideo() {
		System.out.println("uploading the video");
	}
	
	
	public static final int x = 5;
	

	
}