package com.example.cms.controller.exceptions;

public class OrderInformationNotFoundException extends RuntimeException{
    public OrderInformationNotFoundException(int itemId) {
        super("Could not find OrderInformation " + itemId);
    }
}
