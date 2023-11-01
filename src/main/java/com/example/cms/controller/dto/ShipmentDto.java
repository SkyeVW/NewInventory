package com.example.cms.controller.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ShipmentDto {
    private Integer shipmentId;
    private Boolean shipmentStatus;
    private String cancellationReason;


}