package com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message ) {
        super(message);
    }
    public UserNotFoundException() {
        super();
    }
}
