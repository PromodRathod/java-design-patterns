package main.creationalDesignPattern.Builder;

public class ProductOrder {

	String orderId;
	String skuId;
	String categoryId;
	double productPrice;
	double productGst;
	double logisticPrice;
	double logisticGst;
	double commission;
	String orderStatus;
	String paymentStatus;
	
	ProductOrder (ProductOrderBuilder orderBuilder) {
		this.orderId = orderBuilder.orderId;
		this.skuId = orderBuilder.skuId;
		this.categoryId = orderBuilder.orderId;
		this.productPrice = orderBuilder.productPrice;
		this.productGst = orderBuilder.productGst;
		this.logisticPrice = orderBuilder.logisticPrice;
		this.logisticGst = orderBuilder.logisticGst;
		this.commission = orderBuilder.commission;
		this.orderStatus = orderBuilder.orderStatus;
		this.paymentStatus = orderBuilder.paymentStatus;
	}
	
	public static class ProductOrderBuilder {
		String orderId;
		String skuId;
		String categoryId;
		double productPrice;
		double productGst;
		double logisticPrice;
		double logisticGst;
		double commission;
		String orderStatus;
		String paymentStatus;
		
		ProductOrderBuilder (String orderId, String skuId, String categoryId, String orderStatus, String paymentStatus) {
			this.orderId = orderId;
			this.skuId = skuId;
			this.categoryId = categoryId;
			this.orderStatus = orderStatus;
			this.paymentStatus = paymentStatus;
		}
		
		public ProductOrderBuilder setOrderId(String orderId) {
			this.orderId = orderId;
			return this;
		}
		
		public ProductOrderBuilder setSkuId(String skuId) {
			this.skuId = skuId;
			return this;
		}

		public ProductOrderBuilder setCategoryId(String categoryId) {
			this.categoryId = categoryId;
			return this;
		}
		
		public ProductOrderBuilder setProductPrice(double productPrice) {
			this.productPrice = productPrice;
			return this;
		}
		
		public ProductOrderBuilder setLogisticPrice(double logisticPrice) {
			this.logisticPrice = logisticPrice;
			return this;
		}
		
		public ProductOrderBuilder setLogisticGst(double logisticGst) {
			this.logisticGst = logisticGst;
			return this;
		}
		
		public ProductOrderBuilder setProductGst(double productGst) {
			this.productGst = productGst;
			return this;
		}
		
		public ProductOrderBuilder setCommission(double commission) {
			this.commission = commission;
			return this;
		}
		
		public ProductOrderBuilder setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
			return this;
		}
		
		public ProductOrderBuilder setPaymentStatus(String paymentStatus) {
			this.paymentStatus = paymentStatus;
			return this;
		}
		
		public ProductOrder build() {
			return new ProductOrder(this);
		}
	}
	
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public void setLogisticPrice(double logisticPrice) {
		this.logisticPrice = logisticPrice;
	}
	
	public void setLogisticGst(double logisticGst) {
		this.logisticGst = logisticGst;
	}
	
	public void setProductGst(double productGst) {
		this.productGst = productGst;
	}
	
	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	@Override
	public String toString() {
		return "ProductOrder [orderId=" + orderId + ", skuId=" + skuId + ", categoryId=" + categoryId
				+ ", productPrice=" + productPrice + ", productGst=" + productGst + ", logisticPrice=" + logisticPrice
				+ ", logisticGst=" + logisticGst + ", commission=" + commission + ", orderStatus=" + orderStatus
				+ ", paymentStatus=" + paymentStatus + "]";
	}
}
