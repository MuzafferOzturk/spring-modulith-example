package com.example.springmodulithexample.application.createorder.request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class CreateOrderRequest {
    private String name;
    private BigDecimal price;
}
