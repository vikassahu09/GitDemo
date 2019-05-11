package interviewProgram;

public class SmallestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray= {5,34,-1,45,27};
		int i;
		int min= myArray[0];
		
		for(i=1;i<myArray.length;i++)
		{
			if(myArray[i]<min)
				min=myArray[i];
		}
		
		System.out.println("Smallest Element is : "+min);
	}

}
