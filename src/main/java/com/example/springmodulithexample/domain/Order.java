package com.example.springmodulithexample.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Order {
    private String id;
    private OrderStatus status;
    private BigDecimal price;

    public Order(String id, BigDecimal price) {
        this.id = id;
        this.price = price;
        this.status = OrderStatus.CREATED;
    }

    public void complete() {
        this.status = OrderStatus.COMPLETED;
    }
}
