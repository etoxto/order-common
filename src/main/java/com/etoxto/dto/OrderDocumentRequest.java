package com.etoxto.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderDocumentRequest {
    private Long id;
    private String body;
    private List<String> links;
}
