package assignmentPatterns;
import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	 int  odd = 1;
	 int column=1;
	 
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=n-i+1; j++) {
			System.out.print("  ");
		}
		int k =0;
		for(int j=1; j<=odd; j++) {
			if(j>=i) {
				k=k+i;
			}else {
				k=k-1;
			}
			System.out.print(k+" ");
		}
		System.out.println();
		odd = odd+2;
		column =column+2;
	}

	}

}
