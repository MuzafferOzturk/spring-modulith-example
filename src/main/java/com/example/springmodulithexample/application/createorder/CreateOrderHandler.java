package com.example.springmodulithexample.application.createorder;

import com.example.springmodulithexample.application.createorder.request.CreateOrderRequest;
import com.example.springmodulithexample.domain.Product;
import com.example.springmodulithexample.domain.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateOrderHandler {
    private final OrderService orderService;
    public void handle(CreateOrderRequest request) {
        orderService.createOrder(new Product(request.getName(), request.getPrice()));
    }
}
