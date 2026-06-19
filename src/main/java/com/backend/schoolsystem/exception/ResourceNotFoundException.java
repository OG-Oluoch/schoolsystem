package com.backend.schoolsystem.exception;

import com.backend.schoolsystem.errorResponse.ErrorCode;

public class ResourceNotFoundException extends SchoolException {
    public ResourceNotFoundException(ErrorCode errorCode) { super(errorCode); }
    public ResourceNotFoundException(ErrorCode errorCode, String detail) { super(errorCode, detail); }
}

//@ResponseStatus(value = HttpStatus.NOT_FOUND)
//public class ResourceNotFoundException extends RuntimeException{
//
//
//    public ResourceNotFoundException(String message){
//
//        super(message);
//
//    }
//}

//@ResponseStatus(HttpStatus.NOT_FOUND)
//public class ResourceNotFoundException extends RuntimeException {
//    public ResourceNotFoundException(String resource, String field, Object value) {
//        super(String.format("%s not found with %s: '%s'", resource, field, value));
//    }
//    public ResourceNotFoundException(String message) {
//        super(message);
//    }
//}
