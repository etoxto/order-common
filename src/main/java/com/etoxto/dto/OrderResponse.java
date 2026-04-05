package com.etoxto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse implements Serializable {
    private UUID id;
    private Long customerId;
    private String deliveryAddress;
}
