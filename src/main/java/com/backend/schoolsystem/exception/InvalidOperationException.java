package com.backend.schoolsystem.exception;

import com.backend.schoolsystem.errorResponse.ErrorCode;

public class InvalidOperationException extends SchoolException {
    public InvalidOperationException(ErrorCode errorCode) { super(errorCode); }
    public InvalidOperationException(ErrorCode errorCode, String detail) { super(errorCode, detail); }
}
