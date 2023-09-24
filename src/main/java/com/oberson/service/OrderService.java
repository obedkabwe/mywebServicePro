package com.oberson.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oberson.entities.Order;
import com.oberson.repositories.OrderRepository;

@Service
public class OrderService {

	
	@Autowired
	private OrderRepository repository;
	
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	
	public Order findById(Integer id) {
		Optional<Order> obj = repository.findById(id);
		return obj.orElseThrow();
	}
	
	
	
	
	
	
	
	
	
	
	
}
