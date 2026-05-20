package com.backend.schoolsystem.exception;

public class BusinessException extends SchoolException{
    public BusinessException(ErrorCode errorCode) { super(errorCode); }
    public BusinessException(ErrorCode errorCode, String detail) { super(errorCode, detail); }
}
