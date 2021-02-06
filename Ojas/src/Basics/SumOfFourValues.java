package Basics;

import java.util.Scanner;

public class SumOfFourValues {

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
		int sum =num1+num2+num3+num4;
		System.out.println("Sum of values: "+sum);
		
		sc.close();
	}

}
