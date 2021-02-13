package matrix;

import java.util.Scanner;

public class Matrix3D {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size1 of outer arry");
        int size1 = sc.nextInt();
        System.out.println("Enter the size2 of inner arry");
        int size2 = sc.nextInt();
        System.out.println("Enter the size3 of outer arry");
        int size3 = sc.nextInt();
        int[][][] arr = new int[size1][size2][size3];
       
        for(int i=0;i<size1;i++)
        {
            for(int j=0;j<size2;j++)
            {
                System.out.println("enter elements");
                for(int k=0;k<size3;k++)
                {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        for(int i=0;i<size1;i++)
        {
            for(int j=0;j<size2;j++)
            {
                System.out.print("elements are "+ i +"-I-position "+ j+ "-J-position { ");
                for(int k=0;k<size3;k++)
                {
                    System.out.print(arr[i][j][k]+" ");
                }  
                System.out.println("}");
            }
        }
        System.err.println();
	}
}


