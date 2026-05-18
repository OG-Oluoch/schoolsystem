package com.backend.schoolsystem.exception;

import lombok.Getter;

@Getter
public class SchoolException extends RuntimeException{

    private final ErrorCode errorCode;
    private final String detail;

    public SchoolException(ErrorCode errorCode) {
        super(errorCode.getDefaultMessage());
        this.errorCode = errorCode;
        this.detail = null;
    }

    public SchoolException(ErrorCode errorCode, String detail) {
        super(errorCode.getDefaultMessage() + ": " + detail);
        this.errorCode = errorCode;
        this.detail = detail;
    }

    public SchoolException(ErrorCode errorCode, String detail, Throwable cause) {
        super(errorCode.getDefaultMessage() + ": " + detail, cause);
        this.errorCode = errorCode;
        this.detail = detail;
    }
}
