package interviewProgram;

import java.util.Scanner;

public class ProductOfDigitsOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		
		int inputNum= sc.nextInt();
		int product= 1;
		
		while(inputNum>0)
		{
			int rem= inputNum%10;
			product=product*rem;
			inputNum=inputNum/10;
		}
		System.out.println("Product of Digits is: "+product);

	}

}
