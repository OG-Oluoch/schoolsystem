package com.backend.schoolsystem.errorResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

@Data @Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiError {
    private String code;
    private int status;
    private String error;
    private String message;
    private String detail;
    private String path;
    @Builder.Default
    private LocalDateTime timestamp = LocalDateTime.now();
    private List<ErrorDetail> validationErrors;

    public static ApiError of(ErrorCode errorCode, String path) {
        return ApiError.builder()
                .code(errorCode.getCode())
                .status(errorCode.getHttpStatus().value())
                .error(errorCode.getHttpStatus().getReasonPhrase())
                .message(errorCode.getDefaultMessage())
                .path(path)
                .build();
    }

    public static ApiError of(ErrorCode errorCode, String detail, String path) {
        return ApiError.builder()
                .code(errorCode.getCode())
                .status(errorCode.getHttpStatus().value())
                .error(errorCode.getHttpStatus().getReasonPhrase())
                .message(errorCode.getDefaultMessage())
                .detail(detail)
                .path(path)
                .build();
    }

    public static ApiError of(HttpStatus status, String message, String path) {
        return ApiError.builder()
                .code("ERR_" + status.value() + "_000")
                .status(status.value())
                .error(status.getReasonPhrase())
                .message(message)
                .path(path)
                .build();
    }
}
