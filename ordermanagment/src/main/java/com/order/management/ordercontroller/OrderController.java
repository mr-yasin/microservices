package com.order.management.ordercontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.order.management.orderentity.OrderEntity;
import com.order.management.ordermodel.OrderModel;
import com.order.management.orderrepository.OrderRepository;
import com.order.management.orderservice.OrderServiceImp;

import jakarta.transaction.Transactional;

@RestController
public class OrderController {
	@Autowired
	OrderServiceImp service;	
	
	@RequestMapping(method = RequestMethod.GET,path="getall/orders")
	public ArrayList<OrderModel> getAllOrderDetails() {
		
		return service.getAllOrderDetails();
	}
	
	
	@RequestMapping(method = RequestMethod.POST,path="insert/order/details")
	public String insertOrderDetails(@RequestBody OrderEntity request) {
		
		return service.insertOrderDetails(request);
	}
	
	@Transactional
	@RequestMapping(method = RequestMethod.GET,path="getall/orders/{emailId}")
	public List<OrderModel>getOrderDeatilsById(@PathVariable String emailId){
		return service.getOrderDeatilsById(emailId);

	
	}
	
	
	
	

}
