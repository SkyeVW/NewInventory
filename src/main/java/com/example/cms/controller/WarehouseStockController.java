package com.example.cms.controller;

import com.example.cms.controller.exceptions.WarehouseStockNotFoundException;
import com.example.cms.model.entity.Professor;
import com.example.cms.model.entity.WarehouseStock;
import com.example.cms.model.repository.ProfessorRepository;
import com.example.cms.model.repository.WarehouseStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class WarehouseStockController { //
    @Autowired
    private final WarehouseStockRepository repository;

    // test
    public WarehouseStockController(WarehouseStockRepository repository) {
        this.repository = repository;
    }

    // get items that are currently in stock
    @GetMapping("/WarehouseStock/{itemId}")
    List<WarehouseStock> retrieveAllItemsId() {
        return repository.findAll();
    }

    // get item names
    @GetMapping("/WarehouseStock/name/{itemId}")
    List<WarehouseStock> retrieveAllItemsName() {

        return repository.findById(Long.valueOf(itemId));
    }

    @PostMapping("/professors")
    Professor createProfessor(@RequestBody Professor newProfessor) {
        newProfessor.setSalary(Math.max(newProfessor.getSalary(), 30000));
        return repository.save(newProfessor);
    }

    @GetMapping("/professors/{id}")
    Professor retrieveProfessor(@PathVariable("id") Long professorId) {
        return repository.findById(professorId)
                .orElseThrow(() -> new ProfessorNotFoundException(professorId));
    }

    @PutMapping("/professors/{id}")
    Professor updateProfessor(@RequestBody Professor newProfessor, @PathVariable("id") Long professorId) {

        return repository.findById(professorId)
                .map(professor -> {
                    professor.setFirstName(newProfessor.getFirstName());
                    professor.setLastName(newProfessor.getLastName());
                    professor.setSalary(Math.max(newProfessor.getSalary(), 30000));
                    return repository.save(professor);
                })
                .orElseGet(() -> {
                    newProfessor.setId(professorId);
                    newProfessor.setSalary(Math.max(newProfessor.getSalary(), 30000));
                    return repository.save(newProfessor);
                });
    }

    @DeleteMapping("/professors/{id}")
    void deleteProfessor(@PathVariable("id") Long professorId) {
        repository.deleteById(professorId);
    }
}
