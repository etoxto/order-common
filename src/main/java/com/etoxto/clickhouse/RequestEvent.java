package com.etoxto.clickhouse;

import com.etoxto.dto.DocumentStatus;
import com.etoxto.dto.EventType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RequestEvent {
    private LocalDateTime eventTime;
    private Long docId;
    private EventType eventType;
    private DocumentStatus status;
    private int processingMs;
    private String httpStatus;
    private String errorType;
}
