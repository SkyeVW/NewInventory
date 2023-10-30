package com.example.cms.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "WarehouseStock")
public class WarehouseStock {

    @Id
    @NotEmpty
    private int itemId;

    @NotEmpty
    private int currentQuantity;

    @NotEmpty
    private int lotNumber;

    @NotEmpty
    private int expiryMonth;

    @NotEmpty
    private int expiryDay;

    @NotEmpty
    private int expiryYear;

    public WarehouseStock(int itemId, int currentQuantity, int lotNumber, int expiryMonth, int expiryDay, int expiryYear){
        this.itemId = itemId;
        this.currentQuantity = currentQuantity;
        this.lotNumber = lotNumber;
        this.expiryMonth = expiryMonth;
        this.expiryDay = expiryDay;
        this.expiryYear = expiryYear;
    }

}
