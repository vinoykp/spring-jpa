package com.howtodoinjava.demo.web;

import com.howtodoinjava.demo.model.Loans;
import com.howtodoinjava.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController
{
    @Autowired
    EmployeeService service;

    @PostMapping
    public ResponseEntity<Loans> createOrUpdateEmployee( )  {
        Loans updated = service.createOrUpdateEmployee();
        return new ResponseEntity<Loans>(updated, new HttpHeaders(), HttpStatus.OK);
    }

 
}