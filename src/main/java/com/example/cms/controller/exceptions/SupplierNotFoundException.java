package com.example.cms.controller.exceptions;

public class SupplierNotFoundException extends RuntimeException{
    public SupplierNotFoundException(int itemId) {
        super("Could not find supplier information " + itemId);
    }
}
