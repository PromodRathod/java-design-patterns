package main.creationalDesignPattern.Builder;

public class ProductOrderBuilderMain {

	public static void main(String[] args) {
		ProductOrder order = new ProductOrder.ProductOrderBuilder("P123-0101", "SKU001-0034", "CT038-4999",
				"Payment Pending", "Not Paid").setProductPrice(1000).setProductGst(10).setLogisticPrice(100)
				.setLogisticGst(5).build();
		System.out.println("Product Order is : " + order.toString());
	}
}
