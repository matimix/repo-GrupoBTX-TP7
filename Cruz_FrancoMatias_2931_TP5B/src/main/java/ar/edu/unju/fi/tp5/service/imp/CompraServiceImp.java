package ar.edu.unju.fi.tp5.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp5.model.Compra;
import ar.edu.unju.fi.tp5.service.ICompraService;
import ar.edu.unju.fi.tp5.util.TablaCompra;


/**
 * aqui va el cuerpo de los metodos
 * @author Familia
 *
 */

@Service
public class CompraServiceImp implements ICompraService {

	List<Compra> compras = TablaCompra.compras;
	
	@Override
	public void guardarCompra(Compra compra) {
		compras.add(compra);
		
	}

	@Override
	public List<Compra> getAllCompras() {
		return compras;
	}
	

}
