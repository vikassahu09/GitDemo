package interviewProgram;

public class LargestElementInArray {
	public static void main(String[] args) {
		
		int[] myArray= {34,987,456,398,96674};
		int i;
		int max= myArray[0];
		
		for(i=1; i<myArray.length;i++)
		{
			if(myArray[i]>max)
				max=myArray[i];
		}	
	System.out.println("Largest Element is : "+max);
	}
}
