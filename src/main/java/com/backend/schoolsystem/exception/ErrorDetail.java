package com.backend.schoolsystem.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDetail {

    private String field;
    private Object rejectedValue;
    private String message;

}
