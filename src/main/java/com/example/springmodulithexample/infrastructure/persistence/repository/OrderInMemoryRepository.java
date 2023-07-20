package com.example.springmodulithexample.infrastructure.persistence.repository;

import com.example.springmodulithexample.domain.Order;
import com.example.springmodulithexample.domain.repository.OrderRepository;
import com.example.springmodulithexample.infrastructure.persistence.entity.OrderEntity;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Optional;

@Repository
public class OrderInMemoryRepository implements OrderRepository {
    private final HashMap<String, OrderEntity> entityMap = new HashMap<>();

    @Override
    public Optional<Order> findById(String id) {
        OrderEntity orderEntity = entityMap.get(id);
        if (orderEntity == null) {
            return Optional.empty();
        }
        return Optional.of(orderEntity.toOrder());
    }

    @Override
    public String save(Order order) {
        OrderEntity orderEntity = OrderEntity.valueOf(order);
        entityMap.put(orderEntity.getId(), orderEntity);
        return orderEntity.getId();
    }
}
