package Basics;

import java.util.Scanner;

public class NaturalNumbersInRange {

	public static void main(String[] args) 
	{
		String natural ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter In Range Number: ");
		int range = sc.nextInt();
		for(int i=1;i<=range;i++)
		{
			natural+=i+",";
		}
		System.out.println(natural.substring(0, natural.length() - 1));
		sc.close();
	}
}
