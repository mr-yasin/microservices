package com.payment.managment.paymentrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payment.managment.paymententity.PaymentEntity;

public interface PaymentRepository extends JpaRepository<PaymentEntity,Integer> {

}
