package pattern;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1; j<=5;j++)
			{	
				if(i%2==0)
					System.out.print("?");
				else if(i%2!=0)
					if(i==3 && j==3 )
						System.out.print("@");
					else
					System.out.print("#");
				
			}
			System.out.println();
				
		}

	}

}
