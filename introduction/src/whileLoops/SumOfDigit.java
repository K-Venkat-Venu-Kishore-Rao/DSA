package whileLoops;
import java.util.Scanner;

public class SumOfDigit{
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = 0;
			
			do {
				n = sc.nextInt();
				System.out.println(" number is "+n);
			}while(n!=0);
	}
}