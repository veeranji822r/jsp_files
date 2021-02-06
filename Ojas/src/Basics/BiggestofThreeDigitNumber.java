package Basics;

import java.util.Scanner;

public class BiggestofThreeDigitNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num = sc.nextInt();
		int num1,num2,num3;
		 	num1 =  num%10;
		 		num/=10;
			num2 =  num%10;
				num/=10;
			num3 =  num%10;
				num/=10;
			
		if(num1 > num2)
			System.out.println("The Biggest Number is: "+num1);
		else if(num2 > num3)
			System.out.println("The Biggest Number is: "+num2);
		else
			System.out.println("The Biggest Number is: "+num3);
		sc.close();

	}

}
