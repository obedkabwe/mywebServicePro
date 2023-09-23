package com.oberson.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oberson.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer > {

}
