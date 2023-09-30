package com.oberson.configurations;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.oberson.entities.Order;
import com.oberson.entities.User;
import com.oberson.entities.enums.OrderStatus;
import com.oberson.repositories.OrderRepository;
import com.oberson.repositories.UserRepository;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {


		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
		Order o1 = new Order(null,u1,OrderStatus.WAITING_PAYMENT);
		Order o2 = new Order(null,u2, OrderStatus.CANCELED);
		Order o3 = new Order(null, u1, OrderStatus.SHIPPED);
		
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
