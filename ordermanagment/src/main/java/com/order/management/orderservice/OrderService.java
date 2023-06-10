package com.order.management.orderservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.order.management.orderentity.OrderEntity;
import com.order.management.ordermodel.OrderModel;

public interface OrderService {
	
	ArrayList<OrderModel> getAllOrderDetails();
	
	List<OrderModel> getOrderDeatilsById(String emailId);
	
	String insertOrderDetails(OrderEntity request);

   

	

}
