package pattern;
/*
    5
   44
  333
 2222
11111
*/
public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=5; i>=1;i--)
		{
			for (int j=1;j<=5;j++)
			{
				if (j>=i)
					System.out.print(i);
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		
		
	}

}
