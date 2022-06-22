package pe.com.ciberelectrick.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.ciberelectrick.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query("select c from Cliente c where c.estado='1'")
    List<Cliente> findAllCustom();

    @Query("select c from Cliente c where upper(c.nombre) like upper(:nombre) and c.estado='1'")
    List<Cliente> findByName(@Param("nombre") String nombre);

}