package Basics;

import java.util.Scanner;

public class BiggestOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num = sc.nextInt();
		int num1 =  num%10;
			num/=10;
		int num2 =  num%10;
			num/=10;
		if(num1 > num2)
			System.out.println("The Biggest Number is: "+num1);
		else
			System.out.println("The Biggest Number is: "+num2);
		sc.close();

	}

}
