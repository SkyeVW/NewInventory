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
@Table(name = "ExpiringItems")
public class ExpiringItems { // subsets of WarehouseStock with certain dates

    @Id
    @NotNull
//    @OneToOne
//    @JoinColumn(name="itemId")
//    private WarehouseStock itemId;
    private int itemId;

    @NotEmpty
//    @OneToOne
//    @JoinColumn(name="expiryMonth")
//    private WarehouseStock expiryMonth;
    private int expiryMonth;

    @NotEmpty
//    @OneToOne
//    @JoinColumn(name="expiryDay")
//    private WarehouseStock expiryDay;
    private int expiryDay;

    @NotEmpty
//    @OneToOne
//    @JoinColumn(name="expiryYear")
//    private WarehouseStock expiryYear;
    private int expiryYear;

    @NotEmpty
//    @ManyToOne
//    @JoinColumn(name="lotNumber")
//    private WarehouseStock lotNumber;
    private int lotNumber;

//    public ExpiringItems(WarehouseStock itemId, WarehouseStock expiryMonth, WarehouseStock expiryDay, WarehouseStock expiryYear, WarehouseStock lotNumber){
//        this.itemId = itemId;
//        this.expiryMonth = expiryMonth;
//        this.expiryDay = expiryDay;
//        this.expiryYear = expiryYear;
//        this.lotNumber = lotNumber;
//    }

}
