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

    @OneToMany(mappedBy = "itemId")
    @NotEmpty
//    @JoinColumn(name="itemId")
 //   private WarehouseStock itemId;
    private List<WarehouseStock> itemID = new ArrayList<>();

    public Supplier(int supplierId, String supplierName, List<WarehouseStock> itemID){
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.itemID = itemID;

    }

}
