package com.example.cms.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Shipment")
public class Shipment {

    @Id
    @NotNull
    private int shipmentId;

    @NotNull
    private int shipmentMonth;

    @NotNull
    private int shipmentDay;

    @NotNull
    private int shipmentYear;

    @NotNull
    private int shipmentSize;

    @NotNull
    private int newLotNumber; // just for displaying

    @NotNull
    private int newItemId;  // just for displaying

    @NotNull
    private int newExpiryMonth;  // just for displaying

    @NotNull
    private int newExpiryDay;  // just for displaying

    @NotNull
    private int newExpiryYear;  // just for displaying

    public Shipment(int shipmentId, int shipmentMonth, int shipmentDay, int shipmentYear, int shipmentSize, int newLotNumber, int newItemId, int newExpiryMonth, int newExpiryDay, int newExpiryYear){
        this.shipmentId = shipmentId;
        this.shipmentMonth = shipmentMonth;
        this.shipmentDay = shipmentDay;
        this.shipmentYear = shipmentYear;
        this.shipmentSize = shipmentSize;
        this.newLotNumber = newLotNumber;
        this.newItemId = newItemId;
        this.newExpiryMonth = newExpiryMonth;
        this.newExpiryDay = newExpiryDay;
        this.newExpiryYear = newExpiryYear;
    }

}
