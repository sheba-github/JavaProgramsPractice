package InterfaceDemo;

public class Develop implements BankingClient{

	public static void main(String[] args) {
		
	Develop d=new Develop();
	d.login();
	d.paycreditcard();
	//Trying to access static variable through objects
    //System.out.println(d.a);
    System.out.println(BankingClient.a);
	}
	
	public void login() {
		System.out.println("login successful");
	}

	@Override
	public void paymortgage() {
		System.out.println("PayMortgage");
		
	}

	@Override
	public void paydebitcard() {
		System.out.println("Paydebit card");
		
	}

	@Override
	public void paycreditcard() {
		System.out.println("Pay credit card");
		
	}

	@Override
	public void paylineofcredit() {
		System.out.println("pay line of credit");
		
	}

	@Override
	public void paytaxes() {
		System.out.println("paytaxes");
		
	}

	@Override
	public void payinsurance() {
		System.out.println("payinsurance");
		
	}

}
