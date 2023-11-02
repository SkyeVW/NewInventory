package com.example.cms.model.repository;

import com.example.cms.model.entity.Supplier;
import com.example.cms.model.entity.WarehouseStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

    // select all for given a given itemID
    @Query(value = "select * from Supplier s where itemID = :itemId", nativeQuery = true)
    String retrieveAll(@Param("itemId") int itemId);

    // get supplier's name for item
    @Query(value = "select supplierName from Supplier s where itemID = :itemId", nativeQuery = true)
    String retrieveSupplierName(@Param("itemId") int itemId);

    // get supplier's id for item
    @Query(value = "select supplierId from Supplier s where itemID = :itemId", nativeQuery = true)
    Integer retrieveSupplierId(@Param("itemId") int itemId);
}
