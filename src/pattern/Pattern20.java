package pattern;
/*
1
01
010
1010
 */
public class Pattern20 {

	public static void main(String[] args) {
		int count=0;
		// TODO Auto-generated method stub
		for(int i=0;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{	
				
				count++;
					if(count%2==0)
						System.out.print("0");
					else
						System.out.print("1");
				
			}
			System.out.println();
		}
	}

}
