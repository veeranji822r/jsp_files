package Basics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Digit Number: ");
		int number = sc.nextInt();
		
		int rem = number%10;
		int  que = number/100;
		
		System.out.println(rem == que);
		sc.close();
	}

}
