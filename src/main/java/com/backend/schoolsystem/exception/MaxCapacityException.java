package com.backend.schoolsystem.exception;

public class MaxCapacityException extends SchoolException {
    public MaxCapacityException(ErrorCode errorCode) { super(errorCode); }
    public MaxCapacityException(ErrorCode errorCode, String detail) { super(errorCode, detail); }
}
