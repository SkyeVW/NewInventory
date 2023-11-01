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
public interface WarehouseStockRepository extends JpaRepository<WarehouseStock, Long> {

    // get item name in warehouse
    @Query(value = "select itemName from WarehouseStock s where itemId = :itemId", nativeQuery = true)
    WarehouseStock retrieveAllItemsName(@Param("itemId") String itemId);
}
