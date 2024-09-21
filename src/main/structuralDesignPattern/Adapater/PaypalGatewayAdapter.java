package main.structuralDesignPattern.Adapater;

public class PaypalGatewayAdapter implements PaymentGateway {

	private Paypal paymentGateway;
	
	PaypalGatewayAdapter(Paypal gateway) {
		this.paymentGateway = gateway;
		
	}

	@Override
	public void processPayment(double amount) {
		this.paymentGateway.makePayment(amount);
	}
	
}
