package whileLoops;
import java.util.Scanner;

 public class shortcutOfSumOfDigit {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = n;
    int sum = 0;
    
    int numberOfDigits = (int)Math.log10(n)+1;
		System.out.println(numberOfDigits);	
	}
}
