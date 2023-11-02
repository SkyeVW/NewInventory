package com.example.cms.model.repository;

import com.example.cms.model.entity.Shipment;
import com.example.cms.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Integer> {

    @Query(value = "select * from Shipment S", nativeQuery = true)
    List<Shipment> search(@Param("shipmentId") int shipmentId);

    //get shipment date
    @Query(value = "select s.shipmentMonth, s.shipmentDay, s.shipmentYear from Shipment s where " +
            "s.shipmentId = :shipmentId", nativeQuery = true)
    List<Object[]> retrieveDateShipment(@Param("shipmentId") int shipmentId);

    //get shipment size
    @Query(value = "select shipmentSize from Shipment s where " +
            "shipmentId = :shipmentId", nativeQuery = true)
    Integer retrieveSize(@Param("shipmentId") int shipmentId);

    // get new lot number for the new products that are shipping
    @Query(value = "select newLotNumber from Shipment s where " +
            "shipmentId = :shipmentId", nativeQuery = true)
    Integer retrieveNewLotNum(@Param("shipmentId") int shipmentId);

    // get ALL new itemId for the new products that are shipping
    @Query(value = "select newItemId from Shipment s where " +
            "shipmentId = :shipmentId", nativeQuery = true)
    List<Integer> findAllNewItemId(@Param("shipmentId") int shipmentId);

    // get new expiry date for new products
    @Query(value = "select newExpiryMonth, newExpiryDay, newExpiryYear from Shipment s where " +
            "shipmentId = :shipmentId", nativeQuery = true)
    List<Object[]> retrieveNewExpiryDate(@Param("shipmentId") int shipmentId);

    // get status of new products that are shipping
    @Query(value = "select shipmentStatus from Shipment s where " +
            "shipmentId = :shipmentId", nativeQuery = true)
    Boolean retrieveStatus(@Param("shipmentId") int shipmentId);

    // get reason for cancellation
    @Query(value = "select cancellationReason from Shipment s where " +
            "shipmentId = :shipmentId", nativeQuery = true)
    String retrieveReason(@Param("shipmentId") int shipmentId);
}
