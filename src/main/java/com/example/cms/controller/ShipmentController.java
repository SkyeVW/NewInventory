package com.example.cms.controller;

import com.example.cms.controller.dto.ShipmentDto;
import com.example.cms.model.entity.Shipment;
import com.example.cms.model.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class ShipmentController { //
    @Autowired
    private final ShipmentRepository repository;

    public ShipmentController(ShipmentRepository repository) {
        this.repository = repository;
    }

    // get shipmentId
    @GetMapping("/Shipment/")
    List<Shipment> retrieveAllShipment() {
        return repository.findAll();
    }

    @GetMapping("/Shipment/{shipmentId}")
    Optional<Shipment> retrieveShipmentById(@PathVariable("shipmentId") int shipmentId) {
        return repository.findById(shipmentId);
    }

    // get month this shipment is being shipped
    @GetMapping("/Shipment/dateShipment/{shipmentId}")
    Shipment retrieveDateShipment(@PathVariable("shipmentId") int shipmentId) {
        return repository.retrieveDateShipment(shipmentId); // NOT SURE if can do long.valueOf
    }

    // get size of shipment
    @GetMapping("/Shipment/size/{shipmentId}")
    Shipment retrieveSize(@PathVariable("shipmentId") int shipmentId) {
        return repository.retrieveSize(shipmentId); // NOT SURE if can do long.valueOf
    }

    // get new lot number for the new products that are shipping
    @GetMapping("/Shipment/newLotNum/{shipmentId}")
    Shipment retrieveNewLotNum(@PathVariable("shipmentId") int shipmentId) {
        return repository.retrieveNewLotNum(shipmentId); // NOT SURE if can do long.valueOf
    }

    // get new itemId (in a list) for new products that are shipping
    @GetMapping("/Shipment/newItemId/{shipmentId}")
    List<Shipment> retrieveAllNewItemId(@PathVariable("shipmentId") int shipmentId) {
        repository.findAllNewItemId(shipmentId);
        return repository.findAll();
    }

    // get new expiry dates for each new products
    @GetMapping("/Shipment/newExpiryDate/{shipmentId}")
    Shipment retrieveNewExpiryDate(@PathVariable("shipmentId") int shipmentId) {
        return repository.retrieveNewExpiryDate(shipmentId); // NOT SURE if can do long.valueOf
    }

    // get status of shipment (true = shipped, else false)
    @GetMapping("/Shipment/status/{shipmentId}")
    Shipment retrieveStatus(@PathVariable("shipmentId") int shipmentId) {
        return repository.retrieveStatus(shipmentId); // NOT SURE if can do long.valueOf
    }

    // get the reason why shipment is cancelled
    @GetMapping("/Shipment/reasonCancellation/{shipmentId}")
    Shipment retrieveReason(@PathVariable("shipmentId") int shipmentId) {
        return repository.retrieveReason(shipmentId); // NOT SURE if can do long.valueOf
        //Shipment shipment = repository.findById(shipmentId)
        //return shipment.getReason();
    }

    // update shipmentStatus according to user input
    @PutMapping("/Shipment/status/{shipmentId}/{updatedStatus}")
    Shipment updateStatus(@RequestBody ShipmentDto shipmentDto, @PathVariable("shipmentId") int shipmentId, @PathVariable("updatedStatus") boolean updatedStatus) {

//        boolean shipmentStatus = shipmentDto;
//        Shipment shipment = new Shipment();
//        shipment.setShipmentId(shipmentDto.getShipmentId());
//        shipment.setUpdatedStatus(shipmentDto.getUpdatedStatus());

        return repository.findById(shipmentId)
                .map(shipment -> {
                    shipment.setShipmentStatus(updatedStatus);
                    return repository.save(shipment);
                })
                .orElseGet(() ->{
                    Shipment newShipment = new Shipment();
                    newShipment.setShipmentId(shipmentDto.getShipmentId());
                    newShipment.setShipmentStatus(shipmentDto.getShipmentStatus());
                    return repository.save(newShipment);
                })
                ;
    }

    // delete the order that we decide to cancel
    @DeleteMapping("/Shipment/{shipmentId}")
    void deleteShipment(@PathVariable("shipmentId") int shipmentId) {
        repository.deleteById(shipmentId);
    }
}

