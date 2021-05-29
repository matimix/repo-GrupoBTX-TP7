package ar.edu.unju.fi.tp5.repository;

import org.springframework.data.repository.CrudRepository;

import ar.edu.unju.fi.tp5.model.Cliente;




public interface IClienteRepository extends CrudRepository<Cliente,Long> {
      public Cliente findByDni(int dni);

}
