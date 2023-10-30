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
@Table(name = "OrderInformation")
public class OrderInformation {

    @Id
    @NotNull
    private int orderId;

    @ManyToOne // many orderId to one supplier
    @JoinColumn(name="supplierName")
    private Supplier supplierName;

    @ManyToOne
    @JoinColumn(name="supplerId")
    private Supplier supplierId;

    @NotNull
    private long orderDate;

    @NotNull
    private long expectedArrivalDate;

    @OneToOne
    @JoinColumn(name="itemId")
    private Supplier itemId;

    @NotNull
    private int orderQuantity;

    public OrderInformation(int orderId, Supplier supplierName, Supplier supplierId, long orderDate, long expectedArrivalDate, Supplier itemId, int orderQuantity){
        this.orderId = orderId;
        this.supplierName = supplierName;
        this.supplierId = supplierId;
        this.orderDate = orderDate;
        this.expectedArrivalDate = expectedArrivalDate;
        this.itemId = itemId;
        this.orderQuantity = orderQuantity;
    }

}
