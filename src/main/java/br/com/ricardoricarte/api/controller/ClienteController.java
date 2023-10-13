package br.com.ricardoricarte.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ricardoricarte.api.model.Cliente;
import br.com.ricardoricarte.api.repository.ClienteRepository;

@RestController
@CrossOrigin(origins = "*")
public class ClienteController {

  @Autowired
  private ClienteRepository clienteRepository;

  @GetMapping("/")
  public Iterable<Cliente> listarClientes() {
    return clienteRepository.findAll();
  }

  @PostMapping("/")
  public Cliente cadastrar(@RequestBody Cliente cliente) {
    return clienteRepository.save(cliente);
  }

  @PutMapping("/")
  public Cliente editar(@RequestBody Cliente cliente) {
    return clienteRepository.save(cliente);
  }

  @DeleteMapping("/{id}")
  public void remover(@PathVariable Long id) {
    clienteRepository.deleteById(id);
  }

}
