package com.example.Collegeinfo.controller;

import com.example.Collegeinfo.model.College;
import com.example.Collegeinfo.service.Collegeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/college")
public class Collegecontroller {
    @Autowired
    private Collegeservice collegeService;

    @GetMapping("/")
    public List<College> getAllColleges() {
        return collegeService.getAllColleges();
    }

    @GetMapping("/{id}")
    public College getCollegeById(@PathVariable Long id) {
        return collegeService.getCollegeById(id);
    }

    @PostMapping("/")
    public College createCollege(@RequestBody College college) {
        return collegeService.createOrUpdateCollege(college);
    }

    @DeleteMapping("/{id}")
    public void deleteCollege(@PathVariable Long id) {
        collegeService.deleteCollege(id);
    }
}


