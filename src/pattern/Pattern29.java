package pattern;
/*
   *
  **
 ***
****
 */
public class Pattern29 {
	
	/*PRINTING(START PATTERN- right triangle- have to 
	consider space) WITH HELP OF ST VARIABLE -2nd way */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int st=1; int sp=3; int n=4;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=sp; j++)
			{	System.out.print(" ");
			}
			
			for(int k=1; k<=st;k++)
			{ System.out.print("*");
			}
			System.out.println();
			st++;
			sp--;
		}
		
	}

}
