package com.example.cms.controller.exceptions;

public class WarehouseStockNotFoundException extends RuntimeException{
    public WarehouseStockNotFoundException(String code) {
        super("Could not find WarehouseStock " + code);
    }
}
