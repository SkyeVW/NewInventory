package com.example.cms.controller;

import com.example.cms.controller.exceptions.ShipmentNotFoundException;
import com.example.cms.model.entity.Professor;
import com.example.cms.model.entity.Shipment;
import com.example.cms.model.repository.ProfessorRepository;
import com.example.cms.model.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ShipmentController { //
    @Autowired
    private final ShipmentRepository repository;

    public ShipmentController(ShipmentRepository repository) {
        this.repository = repository;
    }

    // get shipmentId
    @GetMapping("/Shipment/{shipmentId}")
    List<Shipment> retrieveAllShipment() {
        return repository.findAll();
    }

    // get month this shipment is being shipped
    @GetMapping("/Shipment/dateShipment/{shipmentId}")
    Shipment retrieveDateShipment(@PathVariable("shipmentId") int shipmentId) {
        return repository.findById(Long.valueOf(shipmentId)) // NOT SURE if can do long.valueOf
                .orElseThrow(() -> new ShipmentNotFoundException(shipmentId));
    }

    // get size of shipment
    @GetMapping("/Shipment/size/{shipmentId}")
    Shipment retrieveSize(@PathVariable("shipmentId") int shipmentId) {
        return repository.findById(Long.valueOf(shipmentId)) // NOT SURE if can do long.valueOf
                .orElseThrow(() -> new ShipmentNotFoundException(shipmentId));
    }

    // get new lot number for the new products that are shipping
    @GetMapping("/Shipment/newLotNum/{shipmentId}")
    Shipment retrieveNewLotNum(@PathVariable("shipmentId") int shipmentId) {
        return repository.findById(Long.valueOf(shipmentId)) // NOT SURE if can do long.valueOf
                .orElseThrow(() -> new ShipmentNotFoundException(shipmentId));
    }

    // get new itemId (in a list) for new products that are shipping
    @GetMapping("/Shipment/newItemId/{shipmentId}")
    List<Shipment> retrieveAllNewItemId(@PathVariable("shipmentId") int shipmentId) {
        repository.findAllNewItemId(shipmentId);
        return repository.findAll();
    }

    // get new expiry dates for each new products
    @GetMapping("/Shipment/newExpiryDate/{shipmentId}")
    Shipment retriveNewExpiryDate(@PathVariable("shipmentId") int shipmentId) {
        return repository.findById(Long.valueOf(shipmentId)) // NOT SURE if can do long.valueOf
                .orElseThrow(() -> new ShipmentNotFoundException(shipmentId));
    }

    // get status of shipment (true = shipped, else false)
    @GetMapping("/Shipment/status/{shipmentId}")
    Shipment retrieveStatus(@PathVariable("shipmentId") int shipmentId) {
        return repository.findById(Long.valueOf(shipmentId)) // NOT SURE if can do long.valueOf
                .orElseThrow(() -> new ShipmentNotFoundException(shipmentId));
    }

    // get the reason why shipment is cancelled
    @GetMapping("/Shipment/reasonCancellation/{shipmentId}")
    Shipment retrieveReason(@PathVariable("shipmentId") int shipmentId) {
        return repository.findById(Long.valueOf(shipmentId)) // NOT SURE if can do long.valueOf
                .orElseThrow(() -> new ShipmentNotFoundException(shipmentId));
    }

    // update shipmentStatus according to user input
    @PutMapping("/Shipment/status/{shipmentId}/{updatedStatus}")
    Shipment updateStatus(@PathVariable("shipmentId") int shipmentId, @PathVariable("updatedStatus") boolean updatedStatus) {

    }
}
