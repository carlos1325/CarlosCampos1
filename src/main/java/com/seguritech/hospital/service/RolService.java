package com.seguritech.hospital.service;

import com.seguritech.hospital.domain.Rol;
import java.util.List;

/**
 * @author Werner
 */
public interface RolService {

    List<Rol> findAll();

    Rol findOne(Long id);

    List<Rol> findByDescripcion(String descripcion);

    void save(Rol rol);

    void delete(Long id);
}
