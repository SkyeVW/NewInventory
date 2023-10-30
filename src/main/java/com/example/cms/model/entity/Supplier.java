package com.example.cms.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Supplier")
public class Supplier {

    @Id
    @NotEmpty
    private int supplierId;

    @NotEmpty
    private String supplierName;

    @OneToMany
    @JoinColumn(name="itemId")
    private WarehouseStock itemId;

    public Supplier(int supplierId, String supplierName, WarehouseStock itemId){
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.itemId = itemId;

    }

}
