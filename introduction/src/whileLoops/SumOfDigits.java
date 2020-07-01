package whileLoops;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int temp =n;
	int sum =0;
	
//	(this is checking while loop function in for loops with applying condition )

	for(int i=10; i>0; i--) {
		int lastDigit = temp%10;
		temp/=10;
		sum+= lastDigit ;
	}
	System.out.println("the sum of digits of " +n+ " is " +sum);
	
	}

}
