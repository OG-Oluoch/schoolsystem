package com.backend.schoolsystem.exception;

import com.backend.schoolsystem.errorResponse.ErrorCode;

public class MaxCapacityException extends SchoolException {
    public MaxCapacityException(ErrorCode errorCode) { super(errorCode); }
    public MaxCapacityException(ErrorCode errorCode, String detail) { super(errorCode, detail); }
}
