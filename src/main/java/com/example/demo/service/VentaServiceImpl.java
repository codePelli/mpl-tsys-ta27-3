package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.VentaDAO;
import com.example.demo.dto.*;

@Service
public class VentaServiceImpl implements VentaService{
	
	@Autowired
	private VentaDAO ventaDAO;
	
	@Override
	public List<Venta> getVentas() {
		// TODO Auto-generated method stub
		return ventaDAO.findAll();
	}

	@Override
	public Venta ventaPorId(int id) {
		// TODO Auto-generated method stub
		return ventaDAO.findById(id).get();
	}

	@Override
	public Venta saveVenta(Venta venta) {
		// TODO Auto-generated method stub
		return ventaDAO.save(venta);
	}

	@Override
	public Venta Venta(Venta venta) {
		// TODO Auto-generated method stub
		return ventaDAO.save(venta);
	}

	@Override
	public void deleteVenta(int id) {
		// TODO Auto-generated method stub
		ventaDAO.deleteById(id);
	}

	@Override
	public com.example.demo.dto.Venta updateVenta(Venta venta) {
		// TODO Auto-generated method stub
		return ventaDAO.save(venta);
	}

}
