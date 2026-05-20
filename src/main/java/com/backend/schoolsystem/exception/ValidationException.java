package com.backend.schoolsystem.exception;

public class ValidationException extends SchoolException {
    public ValidationException(ErrorCode errorCode) { super(errorCode); }
    public ValidationException(ErrorCode errorCode, String detail) { super(errorCode, detail); }
}
