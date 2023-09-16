package com.coding.springboot.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(){
        super("Resource Not Found Exception in Server !!");
    }
    public ResourceNotFoundException(String message){
        super(message);
    }
}
