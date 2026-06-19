package com.backend.schoolsystem.exception;

import com.backend.schoolsystem.errorResponse.ErrorCode;

public class ResourceAlreadyExistsException extends SchoolException {
    public ResourceAlreadyExistsException(ErrorCode errorCode) { super(errorCode); }
    public ResourceAlreadyExistsException(ErrorCode errorCode, String detail) { super(errorCode, detail); }
}
