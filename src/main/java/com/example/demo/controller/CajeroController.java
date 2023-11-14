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

import com.example.demo.dto.Cajero;
import com.example.demo.service.CajeroService;


@RestController
@RequestMapping("/cajero")
public class CajeroController {

	@Autowired
	private CajeroService cajeroService;
	
	@GetMapping("/list")
	public List<Cajero> listCajeros() {
		
		return cajeroService.getCajeros();
	}
	
	@GetMapping("/{codigo}")
	public Cajero cajeroPorCod(@PathVariable int codigo) {
		
		return cajeroService.cajeroPorId(codigo);
	}
	
	@PostMapping("/add")
	public Cajero insertCientifico(@RequestBody Cajero cajero) {
		
		return cajeroService.saveCajero(cajero);
	}
	
    @PutMapping("/{codigo}")
    public Cajero updateCajero(@PathVariable(name = "codigo") int codigo, 
    		@RequestBody Cajero cajero) {
				
    	return cajeroService.updateCajero(cajero);
    }
    
    @DeleteMapping("/{codigo}")
    public void deleteCajero(@PathVariable int codigo) {
    	
    	cajeroService.deleteCajero(codigo);
    }
}
