package doWhile;
import java.util.Scanner;
public class DoWhile2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n =1;
		
		do {
			 n = sc.nextInt();
			 System.out.println(" number is"+n);
		}while(n!=0);
	}

}
