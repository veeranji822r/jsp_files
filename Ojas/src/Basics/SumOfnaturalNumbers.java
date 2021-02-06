package Basics;

import java.util.Scanner;

public class SumOfnaturalNumbers {

	public static void main(String[] args) {
		int natural =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter In Range Number: ");
		int range = sc.nextInt();
		for(int i=1;i<=range;i++)
		{
			natural+=i;
		}
		System.out.println("Sum of NaturalNumbers: "+natural);
		sc.close();
	}

}
