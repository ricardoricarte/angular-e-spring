package br.com.ricardoricarte.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.ricardoricarte.api.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
  
}
