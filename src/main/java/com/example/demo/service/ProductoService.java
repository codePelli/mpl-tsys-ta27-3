package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Producto;


public interface ProductoService {
	
	List<Producto> getProductos();
	
	Producto productoPorId(int codigoCajero);
	
	Producto saveProducto(Producto producto);
	
	Producto updateProducto(Producto producto);
	
	void deleteProducto(int codigoCajero);

}
