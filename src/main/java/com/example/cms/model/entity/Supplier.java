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
@Table(name = "Supplier")
public class Supplier {

    @Id
    @NotNull
    private int supplierId;

    @NotEmpty
    private String supplierName;

    @NotEmpty
    private int itemId;
//    @OneToMany(mappedBy = "itemId", cascade = CascadeType.ALL)
//    @JoinColumn(name="itemId")
    //private List<WarehouseStock> itemId = new ArrayList<>();

//    public Supplier(int supplierId, String supplierName, WarehouseStock itemId){
//        this.supplierId = supplierId;
//        this.supplierName = supplierName;
//        this.itemId = itemId;
//
//    }

}
