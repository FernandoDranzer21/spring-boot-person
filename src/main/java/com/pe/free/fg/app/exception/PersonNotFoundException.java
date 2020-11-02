package com.pe.free.fg.app.exception;

public class PersonNotFoundException extends RuntimeException {

    public PersonNotFoundException(Long id) {

        super(String.format("Person with Id %d not found", id));
    }
}
