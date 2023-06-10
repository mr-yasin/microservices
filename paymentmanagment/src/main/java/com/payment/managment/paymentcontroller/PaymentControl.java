package com.payment.managment.paymentcontroller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.payment.managment.paymentmodel.PaymentModel;
import com.payment.managment.paymentservice.PaymentServiceimp;

@RestController
public class PaymentControl {
	@Autowired
	PaymentServiceimp service;
	
	@RequestMapping(method = RequestMethod.GET,path="/payments")
	public ArrayList<PaymentModel> getAllPaymentDetails(){
		return service.getAllPaymentDetails();
		
	}

}
