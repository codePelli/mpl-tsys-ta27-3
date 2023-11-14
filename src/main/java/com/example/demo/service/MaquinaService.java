package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Maquina;


public interface MaquinaService {

	List<Maquina> getMaquinas();
	
	Maquina maquinaPorId(int codigo);
	
	Maquina saveMaquina(Maquina maquina);
	
	Maquina updateMaquina(Maquina maquina);
	
	void deleteMaquina(int codigo);
}
