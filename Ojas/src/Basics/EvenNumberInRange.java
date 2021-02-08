package Basics;

import java.util.Scanner;

public class EvenNumberInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number bitween the range: ");
		String rev = evenNumbers(sc.nextInt());
		System.out.println(rev.substring(0,rev.length()-1));
		sc.close();
	}
	static String evenNumbers(int range)
	{
		String eveNumbes = "";
		for(int i=2;i<=range;i++)
		{
			if(i % 2 == 0)
				eveNumbes+=i+",";
		}
		return eveNumbes;
	}

}
