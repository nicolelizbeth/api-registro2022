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
import pe.com.ciberelectrick.entity.Distrito;
import pe.com.ciberelectrick.service.DistritoService;

@RestController //Controlador
@RequestMapping("/distrito")//nombre que le asignamos
public class DistritoController {

    @Autowired
    private DistritoService distritoService;

    @GetMapping("/all") //obtener los valores
    public List<Distrito> findAll() {
        return this.distritoService.findAll();
    }

//listar personalizado
    @GetMapping() //obtener los valores
    public List<Distrito> findAllCustom() {
        return this.distritoService.findAllCustom();
    }

    @PostMapping
    public Distrito add(@RequestBody Distrito c) {
        return distritoService.add(c);
    }

//buscar x codigo
    @GetMapping("/{id}")
    public Optional<Distrito> findById(@PathVariable Long id) {
        return distritoService.findById(id);
    }

    @PutMapping("/{id}")
    public Distrito update(@PathVariable Long id, @RequestBody Distrito c) {
        c.setCodigo(id);
        return distritoService.update(c);
    }

//eliminar
    @DeleteMapping("/{id}")
    public Distrito delete(@PathVariable Long id) {
        Distrito objdistrito = new Distrito();
        objdistrito.setCodigo(id);
        return distritoService.delete(Distrito.builder().codigo(id).build());
    }

}
