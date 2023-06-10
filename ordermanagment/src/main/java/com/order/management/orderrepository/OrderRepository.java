package com.order.management.orderrepository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.order.management.orderentity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {

	List<OrderEntity> findByEmailId(String emailId);

	
}
