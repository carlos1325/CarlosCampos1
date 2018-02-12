
package com.seguritech.hospital.repository;

import com.seguritech.hospital.domain.Medico;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author campos
 */
public interface MedicoRepository extends JpaRepository<Medico, Long> {

    
}
