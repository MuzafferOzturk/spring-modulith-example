package com.example.springmodulithexample.controller;

import com.example.springmodulithexample.application.createorder.CreateOrderHandler;
import com.example.springmodulithexample.application.createorder.request.CreateOrderRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/order")
@AllArgsConstructor
public class OrderController {
    private final CreateOrderHandler createOrderHandler;
    @PostMapping
    ResponseEntity<Void> createOrder(CreateOrderRequest createOrderRequest) {
        createOrderHandler.handle(createOrderRequest);
        return ResponseEntity.ok().build();
    }
}
