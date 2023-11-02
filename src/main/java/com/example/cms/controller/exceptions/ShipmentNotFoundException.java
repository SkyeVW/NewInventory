package com.example.cms.controller.exceptions;

public class ShipmentNotFoundException extends RuntimeException{
    public ShipmentNotFoundException(int code) {
        super("Could not find supplier information " + code);
    }
}
