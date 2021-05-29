package ar.edu.unju.fi.tp5.repository;

import org.springframework.data.repository.CrudRepository;

import ar.edu.unju.fi.tp5.model.Compra;



public interface ICompraRepository extends CrudRepository<Compra,Long> {
	public Compra findById(long id);
}
