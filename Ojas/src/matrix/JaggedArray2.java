package matrix;

import java.util.Scanner;

public class JaggedArray2 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of OuterArry");
		int size = sc.nextInt();
		int[][] arrA = new int[size][];
		for(int ir=0;ir<size;ir++)
		{
			 System.out.println("Enter columns in "+ir+" row");
	         int col = sc.nextInt();
	         arrA[ir] = new int[col];
		}
		sc.close();
		
		for(int ir=0;ir<arrA.length;ir++)
		{
			int count = 1;
			for(int ic=0;ic<arrA[ir].length;ic++)
			{
				System.out.print(count+++" ");
			}
			System.out.println();
		}
		
	}

}
