package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Proyecto;


public interface ProyectoDAO  extends JpaRepository<Proyecto, String>{

}
