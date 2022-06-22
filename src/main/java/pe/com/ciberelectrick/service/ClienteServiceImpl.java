package pe.com.ciberelectrick.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrick.entity.Cliente;
import pe.com.ciberelectrick.repository.ClienteRepository;

@Service //indica que es un servicio
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public List<Cliente> findAllCustom() {
        return clienteRepository.findAllCustom();
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public List<Cliente> findByName(String nombre) {
        return clienteRepository.findByName(nombre);
    }

    @Override
    public Cliente add(Cliente c) {
        return clienteRepository.save(c);
    }

    @Override
    public  Cliente update(Cliente c) {
        Cliente objcliente = new Cliente();
        BeanUtils.copyProperties(c, objcliente);
        return clienteRepository.save(objcliente);
    }

    @Override
    public Cliente delete(Cliente c) {
        Cliente objcliente = clienteRepository.getById(c.getCodigo());
        objcliente.setEstado(false);
        return clienteRepository.save(objcliente);
    }

}

