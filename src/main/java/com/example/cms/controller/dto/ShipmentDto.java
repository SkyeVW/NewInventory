package com.example.cms.controller.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;


@Getter
@Setter
public class ShipmentDto {
    private int shipmentId;
    private boolean shipmentStatus;
    private String cancellationReason;

    private int shipmentMonth;

    private int shipmentDay;

    private int shipmentYear;

    private int shipmentSize;

    private int newLotNumber; // just for displaying

    private int newItemId;  // just for displaying

    private int newExpiryMonth;  // just for displaying

    private int newExpiryDay;  // just for displaying

    private int newExpiryYear;  // just for displaying


    public boolean getShipmentStatus() {
        return this.shipmentStatus;
    }
}
