package week3.day1;

public abstract class CanaraBank implements Payments {
	public void recordPaymentDetails() {
		System.out.println("Payments");
	}

	public void cashOnDelivery() {
		System.out.println("cash on delivery");
		
		
	}

	public void upiPayments() {
		System.out.println("upiPayments");
	
		
	}

	public void cardPayments() {
		System.out.println("cardpayment");
		
		
	}

	public void internetBanking() {
		System.out.println("internet banking");
		
	}

}
