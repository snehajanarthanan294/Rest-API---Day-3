package com.example.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.*;
import com.example.repo.*;

@Service


public class entity {
	@Autowired     
    private dbrepo stu;
    
    public entity savedetails(entity s)
    {
   	 return stu.save(s);
    }
    
    public List<entity> getAllDetails()
    {
   	 List<entity> arr = new ArrayList<>();
   	 arr=stu.findAll();
   	 return arr;
//   	 return stu.findAll() ;   
   	 }
    public void deleteDepartmentById(int id)
    {
   	 stu.deleteById(id);
    }
	
}
