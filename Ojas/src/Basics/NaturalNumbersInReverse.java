package Basics;

import java.util.Scanner;

public class NaturalNumbersInReverse {

	public static void main(String[] args) 
	{
		String natural ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter In Range Number: ");
		int range = sc.nextInt();
		for(int i=range;i>=1;i--)
		{
			natural+=i+",";
		}
		System.out.println(natural.substring(0, natural.length() - 1));
		sc.close();

	}

}
