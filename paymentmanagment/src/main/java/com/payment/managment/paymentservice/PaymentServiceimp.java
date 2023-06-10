package com.payment.managment.paymentservice;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.managment.paymententity.PaymentEntity;
import com.payment.managment.paymentmodel.PaymentModel;
import com.payment.managment.paymentrepository.PaymentRepository;



@Service
public class PaymentServiceimp implements PaymetService {
	
	@Autowired
	PaymentRepository repo;

	@Override
	public ArrayList<PaymentModel> getAllPaymentDetails() {
		  ArrayList<PaymentModel> list =new ArrayList<>();
		  
		  ArrayList<PaymentEntity> payments= (ArrayList<PaymentEntity>) repo.findAll();
		  
		  for(PaymentEntity payment:payments) {
			  PaymentModel s1=new PaymentModel();
			  s1.setPaymentId(payment.getPaymentId());
			  s1.setOrderId(payment.getOrderId());
			  s1.setEmailId(payment.getEmailId());
			  s1.setOrderCost(payment.getOrderCost());
			  s1.setPaymentStatus(payment.getPaymentStatus());
			  list.add(s1);
			  
		  }
		return list;
	}

}
