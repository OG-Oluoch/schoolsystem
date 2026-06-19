package com.backend.schoolsystem.exception;

import com.backend.schoolsystem.errorResponse.ErrorCode;

public class ForbiddenException extends SchoolException {
    public ForbiddenException(ErrorCode errorCode) { super(errorCode); }
    public ForbiddenException(ErrorCode errorCode, String detail) { super(errorCode, detail); }
}
