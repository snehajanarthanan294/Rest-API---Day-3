package com.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.entity;
import com.example.service.StudentService;

@RestController
public class studentcontroller {	
	
    @Autowired
    private StudentService stuservice;
    
    @GetMapping("/getStudent")
    public List<entity> getDetails()
    {
    	return stuservice.getAllDetails();
    }
    
    @PostMapping("/addStudent")
    public entity addDetails(@RequestBody entity s)
    {
    	return stuservice.savedetails(s);
    	
    }
    
}