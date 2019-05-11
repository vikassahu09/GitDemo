package pattern;
/*
*
**
* *
*  *
*/
public class Pattern31 {
	public static void main(String[] args) {
		
		int st=1;
		for(int i=1; i<=4;i++)
		{
			for(int j=1; j<=i;j++)
			{
				if(j==1||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		// Another way by 'st' variable
		for(int i=1; i<=4;i++)
		{
			for(int j=1; j<=st;j++)
			{
				if(j==1||j==st)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			st++;
		}
		

	}
	
}
