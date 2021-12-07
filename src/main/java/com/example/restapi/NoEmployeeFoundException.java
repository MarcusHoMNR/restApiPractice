package com.example.restapi;

public class NoEmployeeFoundException extends RuntimeException{
    public NoEmployeeFoundException() {
        super("No employee is found");
    }
}
