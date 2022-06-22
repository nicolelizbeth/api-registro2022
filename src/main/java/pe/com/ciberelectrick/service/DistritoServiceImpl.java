package pe.com.ciberelectrick.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrick.entity.Distrito;
import pe.com.ciberelectrick.repository.DistritoRepository;


@Service //indica que es un servicio
public class DistritoServiceImpl implements DistritoService{
    
    @Autowired
    private DistritoRepository distritoRepository;

    @Override
    public List<Distrito> findAll() {
    return distritoRepository.findAll();
    }

    @Override
    public List<Distrito> findAllCustom() {
    return distritoRepository.findAllCustom();
    }

    @Override
    public Optional<Distrito> findById(Long id) {
    return distritoRepository.findById(id);
    }
    
    @Override
    public List<Distrito> findByName(String nombre) {
    return distritoRepository.findByName(nombre);
    }
    
    @Override
    public Distrito add(Distrito c) {
    return distritoRepository.save(c);
    }
    
    @Override
    public Distrito update(Distrito c) {
    Distrito objdistrito = new Distrito();
    BeanUtils.copyProperties(c, objdistrito);
    return distritoRepository.save(objdistrito);
    }

    @Override
    public Distrito delete(Distrito c) {
    Distrito objdistrito = distritoRepository.getById(c.getCodigo());
    objdistrito.setEstado(false);
    return distritoRepository.save(objdistrito);
    }
    
}
