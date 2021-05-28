package ar.edu.unju.fi.tp5.service.imp;

import java.time.LocalDate;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp5.model.Cliente;
import ar.edu.unju.fi.tp5.service.IClienteService;
import ar.edu.unju.fi.tp5.util.TablaCliente;





@Service("clienteUtilService")
public class ClienteServiceImp implements IClienteService {
	private List<Cliente> clientes;
	private static final Log LOGGER = LogFactory.getLog(ClienteServiceImp.class);
	@Override
	public void generarTablaClientes() {
		clientes= TablaCliente.ListaClientes;
		clientes.add(new Cliente("pasaporte",2020201,"Maria Diaz","mar123@gmail.com","abc123",LocalDate.of(1990,3,3),31,388,4040345, LocalDate.of(2019,03,14)));

		LOGGER.info("METHOD: generarTablaClientes -se agregó el cliente por defecto ->"+clientes.get(clientes.size()-1));
	
	
	}

	@Override
	public void guardarAlumno(Cliente cliente) {
		if(clientes == null) {
			generarTablaClientes();
		}
		clientes.add(cliente);
		LOGGER.info("METHOD: generarNuevoCliente -Se agregó un nuevo cliente ->"+clientes.get(clientes.size()-1));
	
	}

	@Override
	public List<Cliente> obtenerClientes() {
		// TODO Auto-generated method stub
		LOGGER.info("METHOD: obtenerClientes -Se visualizó la tabla de clientes");
		return clientes;
	
	}

}