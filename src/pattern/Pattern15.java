package pattern;
/*
   .
  ..
 ...
....

 */
public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=4;i++)
		{
			for(int j=1; j<=4;j++)
			{
				if(i+j>=5)
					System.out.print(".");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
