package Basics;

import java.util.Scanner;

public class FactorOfGivenNumber {

	public static void main(String[] args)
	{
		String numbers ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Factor Number: ");
		int factor = sc.nextInt();
		for(int i=1;i<=factor/2;i++)
		{
			if(factor%i==0)
			{
				numbers+=i+",";
			}
		}
		sc.close();
		System.out.println("Factors of "+factor+" is: "+numbers);
		
	}

}
