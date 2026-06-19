package com.backend.schoolsystem.exception;

import com.backend.schoolsystem.errorResponse.ErrorCode;

public class TokenException extends SchoolException {
    public TokenException(ErrorCode errorCode) { super(errorCode); }
    public TokenException(ErrorCode errorCode, String detail) { super(errorCode, detail); }
}
