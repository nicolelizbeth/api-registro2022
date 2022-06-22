/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.ciberelectrick.service;

import java.util.List;
import java.util.Optional;
import pe.com.ciberelectrick.entity.Producto;

public interface ProductoService {

    List<Producto> findAll();

    List<Producto> findAllCustom();

    Optional<Producto> findById(Long id);

    List<Producto> findByName(String nombre);

    Producto add(Producto p);

    Producto update(Producto p);

    Producto delete(Producto p);
}
