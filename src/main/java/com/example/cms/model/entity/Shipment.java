package com.example.cms.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.lang.Nullable;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Shipment")
public class Shipment {

    @Id
    @NotNull
    private int shipmentId;

    @NotEmpty
    private int shipmentMonth;

    @NotEmpty
    private int shipmentDay;

    @NotEmpty
    private int shipmentYear;

    @NotEmpty
    private int shipmentSize;

    @NotEmpty
    private int newLotNumber; // just for displaying

    @NotEmpty
    private int newItemId;  // just for displaying

    @NotEmpty
    private int newExpiryMonth;  // just for displaying

    @NotEmpty
    private int newExpiryDay;  // just for displaying

    @NotEmpty
    private int newExpiryYear;  // just for displaying

    @NotEmpty
    private boolean shipmentStatus;

    @Nullable
    private String cancellationReason;

    public Shipment(){}

    public Shipment(int shipmentId, int shipmentMonth, int shipmentDay, int shipmentYear, int shipmentSize, int newLotNumber, int newItemId, int newExpiryMonth, int newExpiryDay, int newExpiryYear, boolean shipmentStatus, String cancellationReason){
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
        this.shipmentStatus = shipmentStatus;
        this.cancellationReason = cancellationReason;
    }


}
