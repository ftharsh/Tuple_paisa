package org.harsh.tuple.paisa.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
    private  String message;
    private  String errorCode;
    private  LocalDateTime timestamp;
    private  Map<String, Object> details;
}

