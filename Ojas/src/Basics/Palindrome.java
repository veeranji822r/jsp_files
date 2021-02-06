package Basics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int rev = 0 ;
		System.out.println("Enter Three Digit Number: ");
		int number = sc.nextInt();
		int rem =number%10;
		number/=10;
		rev = rev*10+rem;
		rem = number%10;
		number/=10;
		rev = rev*10+rem;
		rem = number%10;
		number/=10;
		rev = rev*10+rem;
		System.out.println("Palindrome: "+rev);
		sc.close();
	}

}
