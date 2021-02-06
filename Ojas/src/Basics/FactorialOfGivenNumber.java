package Basics;

import java.util.Scanner;

public class FactorialOfGivenNumber {

	public static void main(String[] args)
	{
		int value =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter factorial Number: ");
		int factorial = sc.nextInt();
		for(int i=factorial;i>0;i--)
		{
			value*=i;
		}
		System.out.println("Factorial Of Number"+value);
		sc.close();
	}

}
