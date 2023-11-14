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

import com.example.demo.dto.Venta;
import com.example.demo.service.VentaService;

@RestController
@RequestMapping("/venta")
public class VentaController {

	@Autowired
	private VentaService ventaService;
	
	@GetMapping("/list")
	public List<Venta> listMaquinas() {
		
		return ventaService.getVentas();
	}
	
	@GetMapping("/{id}")
	public Venta ventaPorId(@PathVariable int id) {
		
		return ventaService.ventaPorId(id);
	}
	
	@PostMapping("/add")
	public Venta insertVenta(@RequestBody Venta venta) {
		
		return ventaService.saveVenta(venta);
	}
	
    @PutMapping("/{id}")
    public Venta updateVenta(@PathVariable(name = "id") int id, 
    		@RequestBody Venta venta) {
				
    	return ventaService.updateVenta(venta);
    }
    
    @DeleteMapping("/{id}")
    public void deleteMaquina(@PathVariable int id) {
    	
    	ventaService.deleteVenta(id);
    }
}
