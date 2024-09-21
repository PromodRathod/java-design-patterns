package main.structuralDesignPattern.Adapater;

public class PaymentMain {

	public static void main(String[] args) {
		PaymentGateway paypalAdapter = new PaypalGatewayAdapter(new Paypal());
		PaymentGateway stripeAdapter = new StripeGatewayAdapter(new Stripe());
		paypalAdapter.processPayment(100);
		stripeAdapter.processPayment(50);
	}
}
