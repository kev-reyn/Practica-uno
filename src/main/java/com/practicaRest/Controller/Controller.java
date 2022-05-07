package com.practicaRest.Controller;

import com.practicaRest.model.Student;
import com.practicaRest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/student")
public class Controller {

    @Autowired
    private StudentRepository repo;

    @GetMapping("")
    public List<Student> selectAll(){
        return repo.findAll();
    }

    @PostMapping
    public void insert(@RequestBody Student student){
       repo.save(student);
    }

}
