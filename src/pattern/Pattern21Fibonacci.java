package pattern;
/*
0
11
235
8132134
*/

public class Pattern21Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0; int second=1; int sum=1;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1; j<=i;j++)
			{
				
					if (i==1 && j==1)
						System.out.print("0");
					else
						{
							System.out.print(sum);
							sum= first+second;
							first=second;
							second=sum;
							
						}
					
					
				
				
			}
			System.out.println();
		}
	}

}
