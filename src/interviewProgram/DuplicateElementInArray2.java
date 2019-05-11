package interviewProgram;

public class DuplicateElementInArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String[] styArray= {"java", "vikas", "mava", "vikas", "java", "VIKAS"};
		int i;
		int j;
		
		for(i=0;i<styArray.length;i++)
		{
			for(j=i+1; j<styArray.length-1;j++)
			{
				if(styArray[i].equals(styArray[j]) && (i!=j))
					System.out.println("Duplicate element is : "+styArray[j]);
			}
		}
		
		
		
		
	}

}
