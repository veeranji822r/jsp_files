package Basics;

import java.util.Scanner;

public class FibanocciSerice {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fibanocci Upto Range Number: ");
		int range = sc.nextInt();
		 int a = 0;
	     int b = 1;
	     int c;
	     for(int i=1;i<range;i++)
	     {
	        c=a+b;
	        System.out.println(a);
	        a=b;
	        b=c;
	     }       
	     sc.close();
	}

}
