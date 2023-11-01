package com.example.cms.model.repository;

import com.example.cms.model.entity.OrderInformation;
import com.example.cms.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderInformationRepository extends JpaRepository<OrderInformation, Integer> {

    // get orderId for item
    @Query(value = "select orderId from OrderInformation OI where itemId = :itemId ", nativeQuery = true)
    OrderInformation retrieveOrderId(@Param("itemId") int itemId);

    // get supplier name for item
    @Query(value = "select supplierName from OrderInformation OI where orderId = :orderId ", nativeQuery = true)
    OrderInformation retrieveSupplierName(@Param("orderId") int orderId);

    // get supplier id for item
    @Query(value = "select supplierId from OrderInformation OI where orderId = :orderId ", nativeQuery = true)
    OrderInformation retrieveSupplierId(@Param("orderId") int orderId);

    // get order date for item
    @Query(value = "select orderDate from OrderInformation OI where orderId = :orderId ", nativeQuery = true)
    OrderInformation retrieveOrderDate(@Param("orderId") int orderId);

    // get expected arrival date for item
    @Query(value = "select expectedArrivalDate from OrderInformation OI where orderId = :orderId ", nativeQuery = true)
    OrderInformation retrieveExpectedArrival(@Param("orderId") int orderId);

    // get itemId for item
    @Query(value = "select itemId from OrderInformation OI where orderId = :orderId ", nativeQuery = true)
    OrderInformation retrieveItemId(@Param("orderId") int orderId);

    // get order quantity for item
    @Query(value = "select orderQuantity from OrderInformation OI where orderId = :orderId ", nativeQuery = true)
    OrderInformation retrieveOrderQuantity(@Param("orderId") int orderId);

}
