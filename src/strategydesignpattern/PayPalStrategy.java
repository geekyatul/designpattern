package strategydesignpattern;

public class PayPalStrategy implements PaymentInterface {

	private String emailId;
	private String password;
	
	public PayPalStrategy(String email, String pwd){
		this.emailId=email;
		this.password=pwd;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal.");
	}

}
