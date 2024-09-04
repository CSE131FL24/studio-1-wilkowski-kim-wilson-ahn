package studio1;

import java.util.Scanner;

public class LeapYearClass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insert Year");
		int number1 = in.nextInt();
		boolean tf = (number1 % 4 == 0) && (number1 % 100 != 0) || (number1 % 400 == 0);
		// TODO Auto-generated method stub
		System.out.println(number1 + " is a leap year true or false: " + tf);
		

	}

}
