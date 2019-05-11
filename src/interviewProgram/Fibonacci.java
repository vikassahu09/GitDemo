package interviewProgram;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0; 
		int second=1;
		int sum=0;
		System.out.println("Enter the terms to be printed");
		Scanner sc = new Scanner(System.in);
		int terms=sc.nextInt();
		
		System.out.print(first+ ","+ second);
		
		for(int i=3; i<=terms;i++)
		{
			sum= first+second;
			
				System.out.print(","+sum);
			first=second;
			second=sum;
		}
		
	}

}
