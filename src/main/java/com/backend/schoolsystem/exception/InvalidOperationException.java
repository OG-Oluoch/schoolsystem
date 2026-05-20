package com.backend.schoolsystem.exception;

public class InvalidOperationException extends SchoolException {
    public InvalidOperationException(ErrorCode errorCode) { super(errorCode); }
    public InvalidOperationException(ErrorCode errorCode, String detail) { super(errorCode, detail); }
}
