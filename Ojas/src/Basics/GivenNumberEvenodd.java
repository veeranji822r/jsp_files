package Basics;

import java.util.Scanner;

public class GivenNumberEvenodd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		if(sc.nextInt()%2 == 0)
			System.out.println("The given number is even..! ");
		else
			System.out.println("the given number is odd..! ");
		sc.close();
	}

}
