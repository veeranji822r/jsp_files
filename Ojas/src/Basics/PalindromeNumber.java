package Basics;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int rev = 0 ;
		System.out.println("Enter Three Digit Number: ");
		int number = sc.nextInt();
		int temp = number;
		int rem =0;
		while(number!=0)
		{
			rem =number%10;
			number/=10;
			rev = rev*10+rem;
		}
		if(rev == temp)
			System.out.println("The given number is Palindrome: "+true);
		else
			System.out.println("The given number is not Palindrome: "+false);
	}

}
