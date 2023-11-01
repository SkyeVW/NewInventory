package com.example.cms.controller;

import com.example.cms.controller.exceptions.ProfessorNotFoundException;
import com.example.cms.controller.exceptions.WarehouseStockNotFoundException;
import com.example.cms.model.entity.Supplier;
import com.example.cms.model.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class SupplierController { //
    @Autowired
    private final SupplierRepository repository;

    public SupplierController(SupplierRepository repository) {
        this.repository = repository;
    }

    // get all suppliers that supply our warehouse
    @GetMapping("/Supplier")
    List<Supplier> retrieveAllSuppliers() {
        return repository.findAll();
    }

    // get the supplier name for specific itemId
    @GetMapping("/Supplier/name/{itemId}")
    Supplier retrieveSupplierName(@PathVariable("itemId") int itemId) {
        return repository.findById(Long.valueOf(itemId))
                .orElseThrow(() -> new WarehouseStockNotFoundException(itemId));
    }

    // get supplier's id for specific itemId
    @GetMapping("/Supplier/id/{itemId}")
    Supplier retrieveSupplierId(@PathVariable("itemId") int itemId) {
        return repository.findById(Long.valueOf(itemId))
                .orElseThrow(() -> new WarehouseStockNotFoundException(itemId));
    }

}
