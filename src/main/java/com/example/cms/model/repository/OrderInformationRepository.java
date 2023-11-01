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


    @Query(value = "select * from students where " +
            "id IN (SELECT s.id FROM STUDENTS s INNER JOIN MARKS m ON s.id = m.studentID " +
            "group by s.id HAVING AVG(Mark) >= 90)", nativeQuery = true)
    List<OrderInformation> findTopStudents();
}
