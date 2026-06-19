package com.backend.schoolsystem.exception;

import com.backend.schoolsystem.errorResponse.ErrorCode;

public class FileProcessingException extends SchoolException {
    public FileProcessingException(ErrorCode errorCode) { super(errorCode); }
    public FileProcessingException(ErrorCode errorCode, String detail) { super(errorCode, detail); }
}
