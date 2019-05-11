
package pattern;
/*
 	1
   12
  123
 1234
12345
 */
public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5;i++)
		{	int k=1;
			for(int j=1; j<=5; j++)
			{
				if(i+j>=6)
					System.out.print(k++);
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
