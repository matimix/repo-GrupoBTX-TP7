package ar.edu.unju.fi.tp5.repository;

import org.springframework.data.repository.CrudRepository;

import ar.edu.unju.fi.tp5.model.Producto;



public interface IProductoRepository extends CrudRepository<Producto,Long> {
	
	public Producto findByCodigo(long codigo);
	

}
