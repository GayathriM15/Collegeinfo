package com.example.Collegeinfo.controller;

import com.example.Collegeinfo.model.Faculty;
import com.example.Collegeinfo.service.Facultyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/faculty")
public class Facultycontroller {
    @Autowired
    private Facultyservice facultyService;

    @GetMapping("/")
    public List<Faculty> getAllFaculties() {
        return facultyService.getAllFaculties();
    }

    @GetMapping("/{id}")
    public Faculty getFacultyById(@PathVariable Long id) {
        return facultyService.getFacultyById(id);
    }

    @PostMapping("/")
    public Faculty createFaculty(@RequestBody Faculty faculty) {
        return facultyService.createOrUpdateFaculty(faculty);
    }

    @PutMapping("/{id}")
    public Faculty updateFaculty(@PathVariable Long id, @RequestBody Faculty faculty) {
        faculty.setId(id);
        return facultyService.createOrUpdateFaculty(faculty);
    }

    @DeleteMapping("/{id}")
    public void deleteFaculty(@PathVariable Long id) {
        facultyService.deleteFaculty(id);
    }
}
