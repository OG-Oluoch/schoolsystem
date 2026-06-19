package com.backend.schoolsystem.exception;

import com.backend.schoolsystem.errorResponse.ErrorCode;

public class UnauthorizedException extends SchoolException {
    public UnauthorizedException(ErrorCode errorCode) { super(errorCode); }
    public UnauthorizedException(ErrorCode errorCode, String detail) { super(errorCode, detail); }
}
