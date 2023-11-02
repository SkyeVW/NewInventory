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
@Table(name = "Restock")
public class Restock { // requests from clients
    @Id
    @NotNull
    private int restockRequestId;

    @NotEmpty
    @OneToMany(mappedBy = "itemId") //one restock can have many itemId
//    @JoinColumn(name="itemId")
    private List<WarehouseStock> itemId = new ArrayList<>();

    @NotEmpty
    private int quantity;

    @NotEmpty
    private int storeId;

//    public Restock(int restockRequestId, WarehouseStock itemId, int quantity, int storeId){
//        this.restockRequestId = restockRequestId;
//        this.itemId = itemId;
//        this.quantity = quantity;
//        this.storeId = storeId;
//    }

}
