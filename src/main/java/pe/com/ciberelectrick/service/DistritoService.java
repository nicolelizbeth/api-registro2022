package pe.com.ciberelectrick.service;

import java.util.List;
import java.util.Optional;
import pe.com.ciberelectrick.entity.Distrito;

public interface DistritoService {

    List<Distrito> findAll();

    List<Distrito> findAllCustom();

    Optional<Distrito> findById(Long id);

    List<Distrito> findByName(String nombre);

    Distrito add(Distrito c);

    Distrito update(Distrito c);

    Distrito delete(Distrito c);
}
