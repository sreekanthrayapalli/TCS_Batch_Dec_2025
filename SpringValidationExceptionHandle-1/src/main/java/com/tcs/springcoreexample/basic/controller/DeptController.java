package com.tcs.springcoreexample.basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.springcoreexample.basic.bean.Dept;
import com.tcs.springcoreexample.basic.service.DeptService;

@RestController
@RequestMapping("/api/depts")
public class DeptController {

    @Autowired
    private DeptService deptService;

    // Create
    @PostMapping
    public ResponseEntity<Dept> createDept(@RequestBody Dept dept) {
        return ResponseEntity.ok(deptService.createDept(dept));
    }

    // Read all
    @GetMapping
    public ResponseEntity<List<Dept>> getAllDepts() {
        return ResponseEntity.ok(deptService.getAllDepts());
    }

    // Read by ID
    @GetMapping("/{id}")
    public ResponseEntity<Dept> getDeptById(@PathVariable String id) {
        return deptService.getDeptById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<Dept> updateDept(@PathVariable String id, @RequestBody Dept deptDetails) {
        return ResponseEntity.ok(deptService.updateDept(id, deptDetails));
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDept(@PathVariable String id) {
        deptService.deleteDept(id);
        return ResponseEntity.noContent().build();
    }
}
