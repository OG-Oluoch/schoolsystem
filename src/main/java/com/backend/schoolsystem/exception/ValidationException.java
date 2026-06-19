package com.backend.schoolsystem.exception;

import com.backend.schoolsystem.errorResponse.ErrorCode;

public class ValidationException extends SchoolException {
    public ValidationException(ErrorCode errorCode) { super(errorCode); }
    public ValidationException(ErrorCode errorCode, String detail) { super(errorCode, detail); }
}
