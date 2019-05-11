package interviewProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Write a program to print LARGEST ODD fibonacci number in a given range. if the
number doesn't fall in the given range then print 0.
given range= 100 and 250- expected output 233
given range 4000 and 11000- expected output 6765
 */


public class FibonaccilargestOddInRange {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		int first= 0;		
		int second= 1;
		int sum=0;
		int n= 50;
		for(int i=3;i<=n;i++)
		{
			sum= first+second;
			if (sum>4000 && sum<11000)
				if(sum%2!=0)
					list.add(sum);
			first=second;
			second=sum;				
		}
		Collections.sort(list);
		if(list.size()>0)
			System.out.println(list.get(list.size()-1));
		else 
			System.out.println(0);
	}

}
