package com.backend.schoolsystem.exception;

import com.backend.schoolsystem.errorResponse.ErrorCode;

public class BusinessException extends SchoolException{
    public BusinessException(ErrorCode errorCode) { super(errorCode); }
    public BusinessException(ErrorCode errorCode, String detail) { super(errorCode, detail); }
}
