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
@Table(name = "Restock")
public class Restock { // requests from clients

    @Id
    @NotNull
    private int restockRequestId;

    @NotEmpty
    @OneToMany //one restock can have many itemId
    @JoinColumn(name="itemId")
    private WarehouseStock itemId;

    @NotEmpty
    private int quantity;


    public Restock(int restockRequestId, WarehouseStock itemId, int quantity){
        this.restockRequestId = restockRequestId;
        this.itemId = itemId;
        this.quantity = quantity;
    }

}
