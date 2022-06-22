package pe.com.ciberelectrick.rest;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.ciberelectrick.entity.Categoria;
import pe.com.ciberelectrick.service.CategoriaService;

@RestController //Controlador
@RequestMapping("/categoria")//nombre que le asignamos
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/all") //obtener los valores
    public List<Categoria> findAll() {
        return this.categoriaService.findAll();
    }

//listar personalizado
    @GetMapping() //obtener los valores
    public List<Categoria> findAllCustom() {
        return this.categoriaService.findAllCustom();
    }

    @PostMapping
    public Categoria add(@RequestBody Categoria c) {
        return categoriaService.add(c);
    }

//buscar x codigo
    @GetMapping("/{id}")
    public Optional<Categoria> findById(@PathVariable Long id) {
        return categoriaService.findById(id);
    }

//actualizar
    @PutMapping("/{id}")
    public Categoria update(@PathVariable Long id, @RequestBody Categoria c) {
        c.setCodigo(id);
        return categoriaService.update(c);
    }

//eliminar
    @DeleteMapping("/{id}")
    public Categoria delete(@PathVariable Long id) {
        Categoria objcategoria = new Categoria();
        objcategoria.setCodigo(id);
        return categoriaService.delete(Categoria.builder().codigo(id).build());
    }
}
