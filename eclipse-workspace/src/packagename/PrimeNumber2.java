package packagename;
import java.lang.Math;

public class PrimeNumber2 {
	public static void main(String[] args) {
		int range = 20;
		
		for(int i=2;i<=range;i++) {
			int count = 0;
			for(int j=1;j<=Math.sqrt(i);j++) {
				if(i%j == 0) {
					count++;
				}
				
			}
			if(count <=1) {
				System.out.println(i+" is a Prime Number");
			}
			
		}
	}
}
