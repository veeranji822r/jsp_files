package Basics;

//import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		int telugu = Integer.parseInt(args[0]);
		int english = Integer.parseInt(args[1]);
		int maths = Integer.parseInt(args[2]);
		int social = Integer.parseInt(args[3]);
		int hindi = Integer.parseInt(args[4]);
		StudentMarks.avrageOfMarks(telugu, english, maths, social, hindi);
	}
	
	public static void avrageOfMarks(int telugu,int english,int maths,int social,int hindi)
	{
		int total =0; double avg = 0;
		total = (telugu + english + maths + social + hindi);
		avg = total/5;
		if(telugu >= 35 && english >= 35 && maths >= 35 && social >= 35 && hindi >= 35)
		{
			System.out.println("Avrage Of Marks: "+avg);
			System.out.println("Total Marks: "+total);
			if(avg >= 61.0)
				System.out.println("First class..");
			if(avg >= 46.0 && avg <= 60.0)
				System.out.println("Second class..");
			if(avg >= 36.0 && avg <= 45.0)
				System.out.println("Thired class..");
		}
		else
		{
			System.out.println("Avrage Of Marks: "+avg);
			System.out.println("Total Marks: "+total);
			System.out.println("failed...");
		}
	
	}
	
}
