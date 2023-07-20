package com.example.springmodulithexample.domain.repository;

import com.example.springmodulithexample.domain.Order;

import java.util.Optional;

public interface OrderRepository {
    Optional<Order> findById(String id);

    String save(Order order);
}
