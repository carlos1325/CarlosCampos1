
package com.seguritech.hospital.repository;

import com.seguritech.hospital.domain.Personas;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Werner
 */
public interface UsuarioRepository extends JpaRepository<Personas, Long>{
    
}
