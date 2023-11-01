package com.example.cms.controller.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ShipmentDto {
    private int shipmentId;
    private boolean shipmentStatus;
    private String cancellationReason;


}
