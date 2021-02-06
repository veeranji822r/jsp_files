package Basics;

import java.util.Scanner;

public class BiggestOfFiveDigitNumber {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter 3rd Number: ");
		int num3 = sc.nextInt();
		System.out.println("Enter 4th Number: ");
		int num4 = sc.nextInt();
		System.out.println("Enter 5th Number: ");
		int num5 = sc.nextInt();
		if(num1 > num2)
			System.out.println("The Biggest Number is: "+num1);
		else if(num2 > num3)
			System.out.println("The Biggest Number is: "+num2);
		else if(num3 > num4)
			System.out.println("The Biggest Number is: "+num3);
		else if(num4 > num5)
			System.out.println("The Biggest Number is: "+num4);
		else
			System.out.println("The Biggest Number is: "+num5);
		sc.close();

	}

}
