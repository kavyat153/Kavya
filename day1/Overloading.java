package week3.day1;

public class Overloading {
	
	public void reportStep(String message,String Status) {
		System.out.println("Msg:"+message+"   "+"sts:"+Status);
	}
	public void reportStep(String message,String status,boolean parameter) {
		System.out.println("msg:"+message+"   "+"Status:"+status+"   "+"snap:"+parameter);
	}
	
	public static void main(String[] args) {
		Overloading ol=new Overloading();
		ol.reportStep("Login","success" );
		ol.reportStep("Login", "Success", false);
	}
	
	
	
}
