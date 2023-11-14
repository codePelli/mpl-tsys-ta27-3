package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.*;

public interface VentaService {
	
	List<Venta> getVentas();
	
	Venta ventaPorId(int id);
	
	Venta saveVenta(Venta venta);
	
	Venta updateVenta(Venta venta);
	
	Venta Venta(Venta venta);
	
	void deleteVenta(int id);

}
