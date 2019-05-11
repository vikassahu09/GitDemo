package oops2;

public class Program2 {

	public static void main(String[] args) {
		

	}

}
class Facebook{
	public void logIn(String userName, String passWord) {
		System.out.println("Login using UN and PWD");
	}
	public void login(long phoneNumber, String passWord) {
		System.out.println("Login using PH.No. and PWD");
	}
}
class FaceBookUpdate extends Facebook{
	public void logIn(String dob) {
		System.out.println("Login using dob");
	}
}