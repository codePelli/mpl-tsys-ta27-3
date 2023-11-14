package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Cajero;


public interface CajeroService {

	List<Cajero> getCajeros();
	
	Cajero cajeroPorId(int codigo);
	
	Cajero saveCajero(Cajero cajero);
	
	Cajero updateCajero(Cajero cajero);
	
	void deleteCajero(int codigo);
}
