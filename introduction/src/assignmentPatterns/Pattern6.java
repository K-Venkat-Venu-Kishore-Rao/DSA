package assignmentPatterns;
import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int odd =1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=odd; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			odd= odd+2;
		}

	}

}
