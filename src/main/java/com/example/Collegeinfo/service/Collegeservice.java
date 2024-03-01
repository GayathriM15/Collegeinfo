package com.example.Collegeinfo.service;

import com.example.Collegeinfo.model.College;
import com.example.Collegeinfo.repository.collegerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Collegeservice {
    @Autowired
    private collegerepository collegeRepository;

    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    public College getCollegeById(Long id) {
        return collegeRepository.findById(id).orElse(null);
    }

    public College createOrUpdateCollege(College college) {
        return collegeRepository.save(college);
    }

    public void deleteCollege(Long id) {
        collegeRepository.deleteById(id);
    }
}

