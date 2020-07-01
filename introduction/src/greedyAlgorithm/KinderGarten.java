package greedyAlgorithm;
import java.util.Arrays;
import java.util.Scanner;

public class KinderGarten{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int c[] = new int[n];
		Arrays.fill(c, 1);
		
		for(int i=1; i<n; i++) {
			if(c[i] > c[i-1]) {
				c[i] = c[i-1] + 1; 
			}
		}
		
		for(int i=n-2; i>=0; i--) {
			if(c[i] > c[i+1]) {
				c[i] = Math.max(c[i+1] + 1, c[i]);
			}
		}
		
		long sum = 0;
		for(int i=0; i<n; i++) {
			sum = sum + (long)c[i];
		}
		return sum;
	}
}