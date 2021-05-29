package ar.edu.unju.fi.tp5.servicee;
import java.util.List;

import ar.edu.unju.fi.tp4.model.Cliente;
import ar.edu.unju.fi.tp4.model.Compra;

public interface ICompraService {
	
	public void addCompra(Compra compra);
	public void guardarCompra(Compra compra);
	public List <Compra> getAllCompras();
	

}
