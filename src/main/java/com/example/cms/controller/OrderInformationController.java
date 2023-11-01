package com.example.cms.controller;

import com.example.cms.controller.exceptions.OrderInformationNotFoundException;
import com.example.cms.model.entity.OrderInformation;
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

    // get supplier Id


}
