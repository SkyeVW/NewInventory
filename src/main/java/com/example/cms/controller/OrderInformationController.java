package com.example.cms.controller;

import com.example.cms.controller.exceptions.OrderInformationNotFoundException;
import com.example.cms.model.entity.OrderInformation;
import com.example.cms.model.entity.WarehouseStock;
import com.example.cms.model.repository.OrderInformationRepository;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class OrderInformationController { //
    @Autowired
    private final OrderInformationRepository repository;

    public OrderInformationController(OrderInformationRepository repository) {
        this.repository = repository;
    }

    // get orderId for specific item
    @GetMapping("/OrderInformation/{itemId}")
    OrderInformation retrieveOrderId(@PathVariable("itemId") int itemId) {
        return repository.retrieveOrderId(itemId);
    }

    // get supplier name for specific item
    @GetMapping("/OrderInformation/supplierName/{orderId}")
    OrderInformation retrieveSupplierName(@PathVariable("orderId") int orderId) {
        return repository.retrieveSupplierName(orderId);
    }

    // get supplier id for specific item
    @GetMapping("/OrderInformation/supplierName/{orderId}")
    OrderInformation retrieveSupplierId(@PathVariable("orderId") int orderId) {
        return repository.retrieveSupplierId(orderId);
    }

    // get order date for specific item
    @GetMapping("/WarehouseStock/date/{orderId}")
    OrderInformation retrieveOrderDate(@PathVariable("orderId") int orderId) {
        return repository.retrieveOrderDate(orderId);
    }

    // get order expected arrival date for specific item
    @GetMapping("/WarehouseStock/expectedArrival/{orderId}")
    OrderInformation retrieveExpectedArrival(@PathVariable("orderId") int orderId) {
        return repository.retrieveExpectedArrival(orderId);
    }

    // get itemId for specific item
    @GetMapping("/WarehouseStock/itemId/{orderId}")
    OrderInformation retrieveItemId(@PathVariable("orderId") int orderId) {
        return repository.retrieveItemId(orderId);
    }

    // get order quantity for specific item
    @GetMapping("/WarehouseStock/orderQuantity/{orderId}")
    OrderInformation retrieveOrderQuantity(@PathVariable("orderId") int orderId) {
        return repository.retrieveOrderQuantity(orderId);
    }

}
