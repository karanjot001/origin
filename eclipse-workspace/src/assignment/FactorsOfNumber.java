package assignment;
import java.util.Scanner;

public class FactorsOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find its factors");
		int a = sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			if(a%i == 0) {
				System.out.println(i);
			}
		}
	}
}
