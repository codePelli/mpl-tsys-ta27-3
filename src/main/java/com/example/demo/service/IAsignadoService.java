package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Asignado;


public interface IAsignadoService {

	List<Asignado> listAsignado();
	
	Asignado saveAsignado(Asignado asignado);
	
	Asignado asiPorCodigo(int id);
	
	Asignado updAsignado(Asignado asignado);
	
	void deleteAsignado(int id);
	
}
