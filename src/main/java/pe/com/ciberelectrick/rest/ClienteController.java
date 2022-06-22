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
import pe.com.ciberelectrick.entity.Cliente;
import pe.com.ciberelectrick.service.ClienteService;

@RestController //Controlador

@RequestMapping("/cliente")//nombre que le asignamos
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/all") //obtener los valores
    public List<Cliente> findAll() {
        return this.clienteService.findAll();
    }

//listar personalizado
    @GetMapping() //obtener los valores
    public List<Cliente> findAllCustom() {
        return this.clienteService.findAllCustom();
    }

    @PostMapping
    public Cliente add(@RequestBody Cliente c) {
        return clienteService.add(c);
    }

//buscar x codigo
    @GetMapping("/{id}")
    public Optional<Cliente> findById(@PathVariable Long id) {
        return clienteService.findById(id);
    }

//actualizar
    @PutMapping("/{id}")
    public Cliente update(@PathVariable Long id, @RequestBody Cliente c) {
        c.setCodigo(id);
        return clienteService.update(c);
    }

//eliminar
    @DeleteMapping("/{id}")
    public Cliente delete(@PathVariable Long id) {
        Cliente objcliente = new Cliente();
        objcliente.setCodigo(id);
        return clienteService.delete(Cliente.builder().codigo(id).build());
    }
}

