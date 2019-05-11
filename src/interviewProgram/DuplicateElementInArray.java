package interviewProgram;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray= {23,45,3,5,6,5,64,6,3};
		String[] styArray= {"java", "vikas", "mava", "vikas", "java", "VIKAS"};
		int i;
		int j;
		
		for(i=0;i<intArray.length;i++)
		{
			for(j=i+1; j<intArray.length-1;j++)
			{
				if(intArray[i]==intArray[j] && (i!=j))
					System.out.println("Duplicate element is : "+intArray[j]);
			}
		}
		
		
		
		
	}

}
