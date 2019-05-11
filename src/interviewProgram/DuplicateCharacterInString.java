package interviewProgram;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacterInString {

	
	public static void main(String[] args) {
		//String s= "ckhgfoenfbcbgqyevfcruaejbcsdf";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s= sc.nextLine();
		HashMap<Character,Integer> charCountMap= new HashMap<Character, Integer>();
		
		char[] strArray= s.toCharArray();
		
		for(char c : strArray)
		{
			if(charCountMap.containsKey(c))
				charCountMap.put(c, charCountMap.get(c)+1);
			else
				charCountMap.put(c, 1);
		}
		
		Set<Character> charInString= charCountMap.keySet();
		for (char ch: charInString)
		{
			if (charCountMap.get(ch)>1)
				System.out.println(ch+" : "+charCountMap.get(ch));
		}
		
	}
}
