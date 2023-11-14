package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CajeroDAO;
import com.example.demo.dto.Cajero;


@Service
public class CajeroServiceImpl implements CajeroService{

	@Autowired
	private CajeroDAO cajeroDAO;
	
	@Override
	public List<Cajero> getCajeros() {
		// TODO Auto-generated method stub
		return cajeroDAO.findAll();
	}

	@Override
	public Cajero cajeroPorId(int codigo) {
		// TODO Auto-generated method stub
		return cajeroDAO.findById(codigo).get();
	}

	@Override
	public Cajero saveCajero(Cajero cajero) {
		// TODO Auto-generated method stub
		return cajeroDAO.save(cajero);
	}

	@Override
	public Cajero updateCajero(Cajero cajero) {
		// TODO Auto-generated method stub
		return cajeroDAO.save(cajero);
	}

	@Override
	public void deleteCajero(int codigo) {
		// TODO Auto-generated method stub
		cajeroDAO.deleteById(codigo);
	}

}
