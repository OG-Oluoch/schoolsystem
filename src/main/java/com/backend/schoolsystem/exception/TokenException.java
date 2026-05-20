package com.backend.schoolsystem.exception;

public class TokenException extends SchoolException {
    public TokenException(ErrorCode errorCode) { super(errorCode); }
    public TokenException(ErrorCode errorCode, String detail) { super(errorCode, detail); }
}
