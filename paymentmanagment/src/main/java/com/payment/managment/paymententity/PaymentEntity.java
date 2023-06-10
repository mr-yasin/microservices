package com.payment.managment.paymententity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="payment_managment")
public class PaymentEntity {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="PAYMENT_ID")
	private int paymentId;
	
	@Column(name="ORDER_ID")
	private int orderId;
	
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	
	@Column(name="ORDER_COST")
	private long orderCost;
	
	@Column(name="PAYMENT_STATUS")
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
