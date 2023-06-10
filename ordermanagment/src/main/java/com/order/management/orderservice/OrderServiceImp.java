package com.order.management.orderservice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.order.management.orderentity.OrderEntity;
import com.order.management.ordermodel.OrderModel;
import com.order.management.orderrepository.OrderRepository;

@Service
public class OrderServiceImp implements OrderService {
	
	@Autowired
	OrderRepository repo;
	

	@Override
	public ArrayList<OrderModel> getAllOrderDetails() {
		ArrayList<OrderModel>list= new ArrayList<>();
		ArrayList<OrderEntity> allOrder=(ArrayList<OrderEntity>)repo.findAll();
		
		for(OrderEntity order : allOrder) {
			OrderModel user= new OrderModel();
			
			user.setOrderId(order.getOrderId());
			user.setEmailId(order.getEmailId());
			user.setOrderStatus(order.getOrderStatus());
			user.setProductName(order.getProductName());
			user.setProductCost(order.getProductCost());
			list.add(user);
		}
		return list;
	}


	@Override
	public String insertOrderDetails(OrderEntity request) {
		
		repo.save(request);
	
		return "Data is Inserted";
	}


	@Override
	public List<OrderModel> getOrderDeatilsById(String emailId) {
		
		List<OrderModel>list=new ArrayList<>();
		
		List<OrderEntity> order=(List<OrderEntity>) repo.findByEmailId(emailId);
		
		
		for(OrderEntity user:order) {
			OrderModel s1=new OrderModel();
			s1.setOrderId(user.getOrderId());
			s1.setEmailId(user.getEmailId());
			s1.setProductName(user.getProductName());
			s1.setProductCost(user.getProductCost());
			s1.setOrderStatus(user.getOrderStatus());
			list.add(s1);
			
			
		}		
		
		return list;
		
		
		
	}


	


	
	
	
	
	

	
	

	


	



}
