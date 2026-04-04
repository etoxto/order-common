package com.etoxto.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class OrderResponse {
    private final UUID id;
    private final Long customerId;
    private final String deliveryAddress;
}
