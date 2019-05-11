package interviewProgram;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number to be reversed");
		Scanner sc= new Scanner(System.in);
		int inputNum= sc.nextInt();
		int revNum=0;
		
		while(inputNum>0)
		{
			int rem= inputNum%10;
			revNum= revNum*10+rem;
			inputNum= inputNum/10;
		}
		System.out.println("The reversed num of given num is: "+ revNum);
		
	}

}
