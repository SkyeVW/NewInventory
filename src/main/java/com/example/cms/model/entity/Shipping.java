package com.example.cms.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.*;


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
    private List<Restock> storeId;

    @NotEmpty
    @OneToMany(mappedBy ="itemId" ) //one restock can have many itemId
//    @JoinColumn(name="itemId")
    private List<WarehouseStock> itemId = new ArrayList<>();

    @NotEmpty
    private int shippingQuantity;

    @NotEmpty
    private boolean shipmentStatus;

//    public Shipping(int shipmentId, Restock storeId, WarehouseStock itemId, int shippingQuantity, boolean shipmentStatus){
//        this.shipmentId = shipmentId;
//        this.storeId = storeId;
//        this.itemId = itemId;
//        this.shippingQuantity = shippingQuantity;
//        this.shipmentStatus = shipmentStatus;
//    }
}
