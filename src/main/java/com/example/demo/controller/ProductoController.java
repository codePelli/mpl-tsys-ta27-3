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

import com.example.demo.dto.Producto;
import com.example.demo.service.ProductoService;


@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/list")
	public List<Producto> listProductos() {
		
		return productoService.getProductos();
	}
	
	@GetMapping("/{codigo}")
	public Producto productoPorCod(@PathVariable int codigo) {
		
		return productoService.productoPorId(codigo);
	}
	
	@PostMapping("/add")
	public Producto insertProducto(@RequestBody Producto producto) {
		
		return productoService.saveProducto(producto);
	}
	
    @PutMapping("/{codigo}")
    public Producto updateProducto(@PathVariable(name = "codigo") int codigo, 
    		@RequestBody Producto producto) {
				
    	return productoService.updateProducto(producto);
    }
    
    @DeleteMapping("/{codigo}")
    public void deleteProducto(@PathVariable int codigo) {
    	
    	productoService.deleteProducto(codigo);
    }
}
