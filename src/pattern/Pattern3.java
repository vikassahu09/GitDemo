package pattern;
/*
123
456
789
 */
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		
		for(int i=1; i<=3;i++)
		{
			for(int j=1; j<=3; j++)
			{	
				System.out.print(k++);
			}
			System.out.println();
		}
		
	}

}
