package interviewProgram;

public class RemoveSpaceString {
	
	public static void main(String[] args) {
		String s= " vikas kumar sahu ";
		System.out.println("Old string"+s);
		
		System.out.println("New string after "
				+ "removing spaces is"+ s.trim()); // remove outer space
		System.out.println("New string "	// remove all space
				+ "after removing spaces is"+ s.replace(" ", ""));
	}

}
