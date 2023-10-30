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
@Table(name = "Shipping")
public class Shipping { // outgoing from warehouse

    @Id
    @NotNull
    private int shipmentId;

    @NotEmpty
    @OneToMany //one restock can have many itemId
    @JoinColumn(name="storeId")
    private Restock storeId;

    @NotEmpty
    @OneToMany //one restock can have many itemId
    @JoinColumn(name="itemId")
    private WarehouseStock itemId;

    @NotEmpty
    private int shippingQuantity;


    public Shipping(int shipmentId, Restock storeId, WarehouseStock itemId, int shippingQuantity){
        this.shipmentId = shipmentId;
        this.storeId = storeId;
        this.itemId = itemId;
        this.shippingQuantity = shippingQuantity;
    }
}
