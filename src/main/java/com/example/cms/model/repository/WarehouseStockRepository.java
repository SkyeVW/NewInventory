package com.example.cms.model.repository;

import com.example.cms.model.entity.CourseMark;
import com.example.cms.model.entity.CourseMarkKey;
import com.example.cms.model.entity.Student;
import com.example.cms.model.entity.WarehouseStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarehouseStockRepository extends JpaRepository<WarehouseStock, Integer> {

    // get all info of item
    @Query(value = "select * from WarehouseStock s where itemId = :itemId", nativeQuery = true)
    WarehouseStock retrieveAllInfo(@Param("itemId") int itemId);

    // get item name in warehouse
    @Query(value = "select itemName from WarehouseStock s where itemId = :itemId", nativeQuery = true)
    String retrieveAllItemsName(@Param("itemId") int itemId);

    // get current quantity of item
    @Query(value = "select currentQuantity from WarehouseStock s where itemId = :itemId", nativeQuery = true)
    Integer retrieveCurrentQuantity(@Param("itemId") int itemId);

    // get existing lot number of item
    @Query(value = "select lotNumber from WarehouseStock s where itemId = :itemId", nativeQuery = true)
    Integer retrieveExistingLotNum(@Param("itemId") int itemId);

    // get expiry date of item (month day year)
    @Query(value = "select expiryMonth, expiryDay, expiryYear from WarehouseStock s where itemId = :itemId", nativeQuery = true)
    List<Object[]> retrieveExpiryDate(@Param("itemId") int itemId);
}
