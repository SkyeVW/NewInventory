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
    @NotEmpty
    @JoinColumn(name="supplierName")
    private Supplier supplierName;

    @ManyToOne
    @NotEmpty
    @JoinColumn(name="supplerId")
    private Supplier supplierId;

    @NotEmpty
    private long orderDate;

    @NotEmpty
    private long expectedArrivalDate;

    @OneToOne
 //   @NotEmpty
    @JoinColumn(name="itemId")
    private Supplier itemId;

    @NotEmpty
    private int orderQuantity;

    @NotEmpty
    private boolean orderConfirmation;

//    public OrderInformation() {}
    public OrderInformation(int orderId, Supplier supplierName, Supplier supplierId, long orderDate, long expectedArrivalDate, Supplier itemId, int orderQuantity, boolean orderConfirmation){
        this.orderId = orderId;
        this.supplierName = supplierName;
        this.supplierId = supplierId;
        this.orderDate = orderDate;
        this.expectedArrivalDate = expectedArrivalDate;
        this.itemId = itemId;
        this.orderQuantity = orderQuantity;
        this.orderConfirmation = orderConfirmation;
    }

    public boolean getOrderConfirmation() {
        return  this.orderConfirmation;
    }

//    public int getOrderId() {
//         return this.orderId;
//    }
}
