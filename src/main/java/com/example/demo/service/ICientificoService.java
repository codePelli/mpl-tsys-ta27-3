package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Cientifico;


public interface ICientificoService {

	List<Cientifico> listCientifico();
	
	Cientifico saveCientifico(Cientifico cientifico);
	
	Cientifico cientificoPorCodigo(String dni);
	
	Cientifico updateCientifico(Cientifico cientifico);
	
	void deleteCientifico(String dni);
}
