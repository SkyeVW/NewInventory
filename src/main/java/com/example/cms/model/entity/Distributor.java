package com.example.cms.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Distributor")
public class Distributor { // companies that ship the supplies to us

    @Id
    @NotNull
    @OneToOne
    @JoinColumn(name="shipmentId")
    private Shipment shipmentId;

    @NotEmpty
    private boolean shipmentStatus;

    @NotEmpty
    private String cancellation; // cancellation reason

    public Distributor(Shipment shipmentId, boolean shipmentStatus, String cancellation){
        this.shipmentId = shipmentId;
        this.shipmentStatus = shipmentStatus;
        this.cancellation = cancellation;
    }

}
