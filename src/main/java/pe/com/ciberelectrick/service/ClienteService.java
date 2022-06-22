package pe.com.ciberelectrick.service;

import java.util.List;
import java.util.Optional;
import pe.com.ciberelectrick.entity.Cliente;

public interface ClienteService {

    List<Cliente> findAll();

    List<Cliente> findAllCustom();

    Optional<Cliente> findById(Long id);

    List<Cliente> findByName(String nombre);

    Cliente add(Cliente c);

    Cliente update(Cliente c);

    Cliente delete(Cliente c);
}
