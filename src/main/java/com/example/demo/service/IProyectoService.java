package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Proyecto;


public interface IProyectoService {

	List<Proyecto> listProyecto();
	
	Proyecto saveProyecto(Proyecto proyecto);
	
	Proyecto proyectoPorCodigo(String id);
	
	Proyecto updateProyecto(Proyecto proyecto);
	
	void deleteProyecto(String id);
}
