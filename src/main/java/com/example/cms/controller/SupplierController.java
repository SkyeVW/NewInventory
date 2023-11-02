package com.example.cms.controller;

import com.example.cms.controller.exceptions.ProfessorNotFoundException;
import com.example.cms.controller.exceptions.WarehouseStockNotFoundException;
import com.example.cms.model.entity.Supplier;
import com.example.cms.model.entity.WarehouseStock;

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

    // get all supplier with itemID
    @GetMapping("/Supplier/name/{itemId}")
    String retrieveAll(@PathVariable("itemId") int itemId) {
        return repository.retrieveSupplierName(itemId);
    }

    // get the supplier name for specific itemId
    @GetMapping("/Supplier/name/{itemId}")
    String retrieveSupplierName(@PathVariable("itemId") int itemId) {
        return repository.retrieveSupplierName(itemId);
    }

    // get supplier's id for specific itemId
    @GetMapping("/Supplier/id/{itemId}")
    Integer retrieveSupplierId(@PathVariable("itemId") int itemId) {
        return repository.retrieveSupplierId(itemId);
    }

}
