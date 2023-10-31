package com.example.cms.model.repository;

import com.example.cms.model.entity.CourseMark;
import com.example.cms.model.entity.CourseMarkKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseStockRepository extends JpaRepository<CourseMark, CourseMarkKey> {

}
