package assignmentPatterns;
import java.util.Scanner;

public class Pattern4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("*");
		for(int j=2; j<=n-1; j++) {
			System.out.print("*");
			for(int i=1; i<=j-1; i++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		if(n>2)
		for(int i=1; i<=n; i++) {
			System.out.print("* ");
		}
	}
}