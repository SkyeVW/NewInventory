package com.example.cms.model.repository;

import com.example.cms.model.entity.Supplier;
import com.example.cms.model.entity.WarehouseStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

    // get supplier's name for item
    @Query(value = "select supplierName from WarehouseStock s where itemId = :itemId", nativeQuery = true)
    String retrieveSupplierName(@Param("itemId") int itemId);

    // get supplier's id for item
    @Query(value = "select supplierId from WarehouseStock s where itemId = :itemId", nativeQuery = true)
    Integer retrieveSupplierId(@Param("itemId") int itemId);
}
