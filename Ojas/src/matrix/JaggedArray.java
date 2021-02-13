package matrix;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter row size");
		        int r= sc.nextInt();
		        int[][] jarry= new int[r][];
		        
		        for(int i=0;i<jarry.length;i++) {
		            System.out.println("Enter columns in "+i+" row");
		            int c=sc.nextInt();
		            jarry[i]= new int[c];
		        }
		        int count=1;
		        for(int i=0;i<jarry.length;i++) {
		            for(int j=0;j<jarry[i].length;j++){
		                System.out.print(count + " ");
		                count++;
		            }
		            System.out.println();
		        }
		    }

}
