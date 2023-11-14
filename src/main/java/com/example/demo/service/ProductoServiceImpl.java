package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductoDAO;
import com.example.demo.dto.Producto;


@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoDAO productoDAO;
	
	@Override
	public List<Producto> getProductos() {
		// TODO Auto-generated method stub
		return productoDAO.findAll();
	}

	@Override
	public Producto productoPorId(int codigo) {
		// TODO Auto-generated method stub
		return productoDAO.findById(codigo).get();
	}

	@Override
	public Producto saveProducto(Producto producto) {
		// TODO Auto-generated method stub
		return productoDAO.save(producto);
	}

	@Override
	public Producto updateProducto(Producto producto) {
		// TODO Auto-generated method stub
		return productoDAO.save(producto);
	}

	@Override
	public void deleteProducto(int codigo) {
		// TODO Auto-generated method stub
		productoDAO.deleteById(codigo);
	}

}
