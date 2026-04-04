package com.etoxto.kafka;

import lombok.Data;

import java.util.UUID;

@Data
public class OrderCreatedEvent {
    private UUID kafkaId;
    private Long customerId;
    private String deliveryAddress;
}
