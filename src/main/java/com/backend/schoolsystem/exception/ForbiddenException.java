package com.backend.schoolsystem.exception;

public class ForbiddenException extends SchoolException {
    public ForbiddenException(ErrorCode errorCode) { super(errorCode); }
    public ForbiddenException(ErrorCode errorCode, String detail) { super(errorCode, detail); }
}
