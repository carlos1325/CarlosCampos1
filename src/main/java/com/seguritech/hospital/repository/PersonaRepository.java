
package com.seguritech.hospital.repository;

import com.seguritech.hospital.domain.Personas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author campos
 */
public interface PersonaRepository extends JpaRepository <Personas, Long> {

    
}
