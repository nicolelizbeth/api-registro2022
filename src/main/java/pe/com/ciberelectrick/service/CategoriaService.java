package pe.com.ciberelectrick.service;

import java.util.List;
import java.util.Optional;
import pe.com.ciberelectrick.entity.Categoria;

public interface CategoriaService {

    List<Categoria> findAll();

    List<Categoria> findAllCustom();

    Optional<Categoria> findById(Long id);

    List<Categoria> findByName(String nombre);

    Categoria add(Categoria c);

    Categoria update(Categoria c);

    Categoria delete(Categoria c);
}
