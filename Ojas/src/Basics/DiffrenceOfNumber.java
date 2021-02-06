package Basics;

import java.util.Scanner;

public class DiffrenceOfNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Digit Number: ");
		int twoDigitNumber = sc.nextInt();
			int num1 =  twoDigitNumber%10;
				twoDigitNumber/=10;
			int num2 =  twoDigitNumber%10;
				twoDigitNumber/=10;
			int diff = num1-num2;
			System.out.println(Math.abs(diff));
		sc.close();
	}

}
