package packagename;

public class LeapYear {
	public static void main(String[] args) {
		int year = 2012;
		if(year%4 == 0) {
			System.out.println(year+" is a Leap Year");
		}
		else {
			System.out.println(year+" is not a Leap Year");
		}
	}
}
