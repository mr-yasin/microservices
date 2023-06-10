package com.payment.managment.paymentmodel;

public class PaymentModel {

	private int paymentId;
	private int orderId;
	private String emailId;
	private long orderCost;
	private String paymentStatus;
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getOrderCost() {
		return orderCost;
	}
	public void setOrderCost(long orderCost) {
		this.orderCost = orderCost;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	

}
