package com.etoxto.dto;

import lombok.Data;

/*
* можно заюзать record
*/

@Data
public class OrderCreatedRequest {
    private Long customerId;
    private String deliveryAddress;
}
