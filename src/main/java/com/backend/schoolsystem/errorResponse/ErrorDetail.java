package com.backend.schoolsystem.errorResponse;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ErrorDetail {

    private LocalDateTime timeStamp;
    private String errorDetails;
    private Object rejectedValue;
    private String errorMessage;

}
