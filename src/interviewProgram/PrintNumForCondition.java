package interviewProgram;
/*Write a program to print numbers between given ranges.
 * However When a no. is multiple of 3, the print cloud
 * when the number is multiple of 7 then print NIX
 * when the number is multiple of 3 and 7 , then print CLOUDNIX. 
 * 
 */
import java.util.Scanner;
public class PrintNumForCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter start of range");
		Scanner sc= new Scanner(System.in);
		int start=sc.nextInt();
		System.out.println("Enter end of range");
		//Scanner sc1= new Scanner(System.in);
		
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i++ )
		{	
			if (i%3==0 && i%7==0)
				System.out.println("CLOUDNIX");
			else if(i%3==0)
				System.out.println("CLOUD");
			else if(i%7==0)
				System.out.println("NIX");
			else
			System.out.println(i);
		}

	}

}
