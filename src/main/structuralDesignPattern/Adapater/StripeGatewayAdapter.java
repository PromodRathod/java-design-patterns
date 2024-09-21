package main.structuralDesignPattern.Adapater;

public class StripeGatewayAdapter implements PaymentGateway {

	private Stripe paymentGateway;
	
	StripeGatewayAdapter(Stripe gateway) {
		this.paymentGateway = gateway;
		
	}

	@Override
	public void processPayment(double amount) {
		this.paymentGateway.charge(amount);
	}
	
}
