package week3.day1;

public class LoginTestData extends TestData {
 
	public void enterUsername() {
		System.out.println("enterUsername:kavya");
	}
	public void enterPassword() {
		System.out.println("enterPassword:aibv");
	}
	public static void main(String[] args) {
		LoginTestData lg=new LoginTestData();
		lg.enterCredentials();
		lg.navigateToHomePage();
		lg.enterPassword();
		lg.enterUsername();
	}
}
