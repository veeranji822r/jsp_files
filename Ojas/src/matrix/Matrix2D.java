package matrix;

import java.util.Scanner;

public class Matrix2D {

	public static void main(String[] args) {
		int arrA[][] = new int[4][4];
		int arrB[][] = new int[4][4];
		int arrC[][] = new int[4][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A matrix rows and clms? ");
		int rows1 = sc.nextInt();
		int clms1 = sc.nextInt();
		System.out.println("Enter B matrix rows and clms? ");
		int rows2 = sc.nextInt();
		int clms2 = sc.nextInt();
		
		//Read the values for matrix A 
		System.out.println("Enter A matrix values: ");
		for(int ir=0;ir<rows1;ir++)
		{
			for(int ic=0;ic<clms1;ic++)
			{
				arrA[ir][ic]=sc.nextInt();
			}
		}
		
		//Read the values for matrix B 
		System.out.println("Enter B matrix values: ");
		for(int ir=0;ir<rows2;ir++)
		{
			for(int ic=0;ic<clms2;ic++)
			{
				arrB[ir][ic]=sc.nextInt();
			}
		}
		
		//Printing the A matrix values 
		System.out.println("Printing A matrix values: ");
		for(int ir=0;ir<rows1;ir++)
		{
			for(int ic=0;ic<clms1;ic++)
			{
				System.out.print(arrA[ir][ic]+" ");
			}
			System.out.println();
		}
		
		//Printing the B matrix values
		System.out.println("Printing B matrix values: ");
		for(int ir=0;ir<rows2;ir++)
		{
			for(int ic=0;ic<clms2;ic++)
			{
				System.out.print(arrB[ir][ic]+" ");
			}
			System.out.println();
		}
		sc.close();
		//Multiplication 
		for(int ir=0;ir<rows1;ir++)
		{
			for(int ic=0;ic<clms2;ic++)
			{
				arrC[ir][ic] = 0;
				for(int im=0;im<rows2;im++)
				{
					arrC[ir][ic] += (arrA[ir][im]*arrB[im][ic]);
				}
			}
		}
		//Printing the B matrix values
		System.out.println("Printing C matrix values: ");
		for(int ir=0;ir<rows1;ir++)
		{
			for(int ic=0;ic<clms2;ic++)
			{
				System.out.print(arrC[ir][ic]+" ");
			}
			System.out.println();
		}
		
	}

}
