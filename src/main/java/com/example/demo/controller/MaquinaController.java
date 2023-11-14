package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Maquina;
import com.example.demo.service.MaquinaService;


@RestController
@RequestMapping("/maquina")
public class MaquinaController {

	@Autowired
	private MaquinaService maquinaService;
	
	@GetMapping("/list")
	public List<Maquina> listMaquinas() {
		
		return maquinaService.getMaquinas();
	}
	
	@GetMapping("/{codigo}")
	public Maquina maquinaPorCod(@PathVariable int codigo) {
		
		return maquinaService.maquinaPorId(codigo);
	}
	
	@PostMapping("/add")
	public Maquina insertMaquina(@RequestBody Maquina maquina) {
		
		return maquinaService.saveMaquina(maquina);
	}
	
    @PutMapping("/{codigo}")
    public Maquina updateMaquina(@PathVariable(name = "codigo") int codigo, 
    		@RequestBody Maquina maquina) {
				
    	return maquinaService.updateMaquina(maquina);
    }
    
    @DeleteMapping("/{codigo}")
    public void deleteMaquina(@PathVariable int codigo) {
    	
    	maquinaService.deleteMaquina(codigo);
    }
	
}
