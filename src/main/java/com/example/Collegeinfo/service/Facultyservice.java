package com.example.Collegeinfo.service;

import com.example.Collegeinfo.model.Faculty;
import com.example.Collegeinfo.repository.facultyrepository;
import com.example.Collegeinfo.repository.facultyrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Facultyservice {
    @Autowired
    private facultyrepository facultyRepository;

    public List<Faculty> getAllFaculties() {
        return facultyRepository.findAll();
    }

    public Faculty getFacultyById(Long id) {
        return facultyRepository.findById(id).orElse(null);
    }

    public Faculty createOrUpdateFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public void deleteFaculty(Long id) {
        facultyRepository.deleteById(id);
    }
}

