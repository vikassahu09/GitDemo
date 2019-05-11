package interviewProgram;

import java.util.Scanner;

public class CountNumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enet the number whom digits to be counted");
		Scanner sc= new Scanner(System.in);
		int inputNum= sc.nextInt();
		int count=0;
		while(inputNum>0)
		{
			count= count+1;
			inputNum= inputNum/10;
		}
		System.out.println("Count of digits are: "+count);
	}

}
