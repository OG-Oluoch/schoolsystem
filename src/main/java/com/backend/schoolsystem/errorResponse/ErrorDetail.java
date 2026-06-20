package com.backend.schoolsystem.errorResponse;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Data
@Builder
public class ErrorDetail {


    private String field;
    private Object rejectedValue;
    private String message;

}
