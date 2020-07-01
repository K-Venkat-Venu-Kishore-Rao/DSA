package array;
import java.util.Scanner;

public class BubbleSort{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {3,2,-1,5,4};
		int n =a.length;
		boolean sorted =true;
		
		
		
		for(int i=0;i<n-1; i++) {
			for(int j=0; j<n-1; j++) {
				if(a[j+1]<a[j]) {
					int temp =a[j+1];
					a[j+1]=a[j];
					a[j] =temp;
					sorted =false;
				}
			}
			if(sorted ==true) break;
		}
		
		for(int item:a) {
			System.out.print(item+" ");
		}
	}
}