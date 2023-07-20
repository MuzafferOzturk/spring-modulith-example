package com.example.springmodulithexample.infrastructure.persistence.entity;

import com.example.springmodulithexample.domain.Order;
import com.example.springmodulithexample.domain.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class OrderEntity {
    private String id;
    private OrderStatus status;
    private BigDecimal price;

    public Order toOrder() {
        Order order = new Order();
        order.setId(id);
        order.setStatus(status);
        order.setPrice(price);
        return order;
    }

    public static OrderEntity valueOf(Order order) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setId(order.getId());
        orderEntity.setStatus(order.getStatus());
        orderEntity.setPrice(order.getPrice());
        return orderEntity;
    }

}
