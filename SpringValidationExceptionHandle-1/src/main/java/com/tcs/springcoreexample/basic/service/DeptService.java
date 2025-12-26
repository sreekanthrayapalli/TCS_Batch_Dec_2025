package com.tcs.springcoreexample.basic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.springcoreexample.basic.bean.Dept;
import com.tcs.springcoreexample.basic.repo.DeptRepository;

@Service
public class DeptService {

    @Autowired
    private DeptRepository deptRepository;

    // Create
    public Dept createDept(Dept dept) {
        return deptRepository.save(dept);
    }

    // Read all
    public List<Dept> getAllDepts() {
        return deptRepository.findAll();
    }

    // Read by ID
    public Optional<Dept> getDeptById(String deptno) {
        return deptRepository.findById(deptno);
    }

    // Update
    public Dept updateDept(String deptno, Dept deptDetails) {
        return deptRepository.findById(deptno)
                .map(dept -> {
                    dept.setDname(deptDetails.getDname());
                    dept.setLoc(deptDetails.getLoc());
                    dept.setCapacity(deptDetails.getCapacity());
                    return deptRepository.save(dept);
                })
                .orElseThrow(() -> new RuntimeException("Dept not found with id " + deptno));
    }

    // Delete
    public void deleteDept(String deptno) {
        deptRepository.deleteById(deptno);
    }
}
