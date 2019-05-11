package interviewProgram;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
	public static void main(String[] args) {
		System.out.println("Enter Number to be summed");
		Scanner sc = new Scanner(System.in);
		int inputNum= sc.nextInt();
		
		int sum= 0;
		while(inputNum>0)
		{
		sum=sum+inputNum%10	;
		inputNum=inputNum/10;
		}
		System.out.println("Sum of input number is: "+sum);
	}
}
