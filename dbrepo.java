package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.entity;


public interface dbrepo extends JpaRepository<entity,Integer> 
{

}