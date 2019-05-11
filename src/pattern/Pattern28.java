package pattern;
/*
 * 
*
**
***
****

 */
public class Pattern28 {
//PRINTING(START PATTERN- left triangle- not to handle space) WITH HELP OF ST VARIABLE -2nd way
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int st=1;
		for(int i=1; i<=4;i++)
		{
			for(int j=1; j<=st;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			st++;
		}
		

	}

}
