package com.example.cms.controller;

import com.example.cms.controller.exceptions.WarehouseStockNotFoundException;
import com.example.cms.model.entity.Professor;
import com.example.cms.model.entity.Shipment;
import com.example.cms.model.entity.WarehouseStock;
import com.example.cms.model.repository.ProfessorRepository;
import com.example.cms.model.repository.WarehouseStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class WarehouseStockController { //
    @Autowired
    private final WarehouseStockRepository repository;

    // test
    public WarehouseStockController(WarehouseStockRepository repository) {
        this.repository = repository;
    }

    // get ALL items that are currently in stock
    @GetMapping("/WarehouseStock")
    List<WarehouseStock> retrieveAllItemsId() {
        return repository.findAll();
    }

    // get every info for items that are currently in stock
    @GetMapping("/WarehouseStock/{itemId}")
    WarehouseStock retrieveAllInfo(@PathVariable("itemId") int itemId) {
        return repository.retrieveAllInfo(itemId);
    }

    // get item names
    @GetMapping("/WarehouseStock/name/{itemId}")
    String retrieveAllItemsName(@PathVariable("itemId") int itemId) {
        return repository.retrieveAllItemsName(itemId);
    }

    // get current quantity of specific itemId
    @GetMapping("/WarehouseStock/currentQuantity/{itemId}")
    Integer retrieveCurrentQuantity(@PathVariable("itemId") int itemId) {
        return repository.retrieveCurrentQuantity(itemId);
    }

    // get existing lot number of specific itemId
    @GetMapping("/WarehouseStock/lotNum/{itemId}")
    Integer retrieveExistingLotNum(@PathVariable("itemId") int itemId) {
        return repository.retrieveExistingLotNum(itemId);
    }

    // get expiring date of specific itemId
    @GetMapping("/WarehouseStock/expiryDate/{itemId}")
    List<Object[]> retrieveExpiryDate(@PathVariable("itemId") int itemId) {
        return repository.retrieveExpiryDate(itemId);
    }

    // update current quantity according to user input (manager)
    @PutMapping("/WarehouseStock/{itemId}")
    WarehouseStock updateCurrentQuantity(@RequestBody WarehouseStock warehouseStock, @PathVariable("itemId") int itemId) {
        return repository.findById(itemId)
                .map(stock -> {
                    stock.setCurrentQuantity(warehouseStock.getCurrentQuantity());
                    return repository.save(stock);
                })
                .orElseThrow(() -> new WarehouseStockNotFoundException(itemId));
    }
}
