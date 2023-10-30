package com.example.cms.controller.exceptions;

public class SupplierNotFoundException extends RuntimeException{
    public SupplierNotFoundException(String code) {
        super("Could not find supplier information " + code);
    }
}
