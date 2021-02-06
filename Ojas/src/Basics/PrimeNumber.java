package Basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Factor Number: ");
		int number = sc.nextInt();
		for(int i=2;i<=number/2;i++)
		{
			if(number % i==0)
			{
				flag = true;
			}
		}
		if(!flag)
		{
			System.out.println(number+" It is a prime number..");
		}
		else
		{
			System.out.println(number+"It is not a prime number..");
		}
		sc.close();
	}

}
