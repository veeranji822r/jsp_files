package Basics;

import java.util.Scanner;

public class SumOfTwoDigitNumber {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Digit Number: ");
		int twoDigitNumber = sc.nextInt();
		int sum =0;
		int rem = twoDigitNumber%10;
			twoDigitNumber/=10;
			sum+=rem;
			rem = twoDigitNumber%10;
			twoDigitNumber/=10;
			sum+=rem;
			System.out.println("SumOfTwoDigitNumber: "+sum);
		sc.close();
	}

}
