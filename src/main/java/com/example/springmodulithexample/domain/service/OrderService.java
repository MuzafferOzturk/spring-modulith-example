package com.example.springmodulithexample.domain.service;

import com.example.springmodulithexample.domain.Order;
import com.example.springmodulithexample.domain.Product;
import com.example.springmodulithexample.domain.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@AllArgsConstructor
@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public String createOrder(Product product) {
        Order order = new Order(UUID.randomUUID().toString(), product.price());
        return orderRepository.save(order);
    }

    public void completeOrder(String id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        order.complete();
        orderRepository.save(order);
    }
}
