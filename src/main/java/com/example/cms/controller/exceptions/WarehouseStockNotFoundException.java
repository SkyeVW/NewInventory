package com.example.cms.controller.exceptions;

public class WarehouseStockNotFoundException extends RuntimeException{
    public WarehouseStockNotFoundException(int itemId) {
        super("Could not find WarehouseStock " + itemId);
    }
}
