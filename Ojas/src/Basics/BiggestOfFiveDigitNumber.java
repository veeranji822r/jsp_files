package Basics;

import java.util.Scanner;

public class BiggestOfFiveDigitNumber {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter FiveDigit Number: ");
		int num = sc.nextInt();
		
		int num1,num2,num3,num4,num5;
			num1 =  num%10;
				num/=10;
			num2 =  num%10;
				num/=10;
			num3 =  num%10;
				num/=10;
			num4 =  num%10;
				num/=10;
			num5 =  num%10;
				num/=10;
				
		if(num1 > num2)
			System.out.println("The Biggest Number is: "+num1);
		else if(num2 > num3)
			System.out.println("The Biggest Number is: "+num2);
		else if(num3 > num4)
			System.out.println("The Biggest Number is: "+num3);
		else if(num4 > num5)
			System.out.println("The Biggest Number is: "+num4);
		else
			System.out.println("The Biggest Number is: "+num5);
		sc.close();

	}

}
