package exampleAdvancedPattern;
import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   int n =sc.nextInt();
	   int number= 2*n-1;
	   for(int i=1; i<=number; i++) {
		   if(i<=n) {
			   for(int j=1; j<=n-i+1; j++) {
				   System.out.print("  ");
			   }
			   for(int j=1; j<=i; j++) {
				   System.out.print("* ");
			   }
		   }else {
			   for(int j=1; j<=i-4; j++) {
				   System.out.print("  ");
			   }
			   for(int j=1; j<=number-i+1; j++) {
				   System.out.print("* ");
			   }
		   }
		   System.out.println();
	   }
	   
	}

}
