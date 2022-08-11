package com.sambit.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FOUND)
public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVersionUid = 1L;
    public ResourceNotFoundException(String message){
        super(message);
    }
}