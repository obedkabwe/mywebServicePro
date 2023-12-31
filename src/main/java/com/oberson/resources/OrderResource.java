package com.oberson.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oberson.entities.Order;
import com.oberson.service.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> oders (){
		List<Order> li = service.findAll();
	 return ResponseEntity.ok().body(li);	
	 }
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Integer id){
		Order obj  = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
	
	
	
	
	
	
}
