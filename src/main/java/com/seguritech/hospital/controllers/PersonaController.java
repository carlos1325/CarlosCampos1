
package com.seguritech.hospital.controllers;

import com.seguritech.hospital.domain.Medico;
import com.seguritech.hospital.domain.Personas;
import com.seguritech.hospital.repository.MedicoRepository;
import com.seguritech.hospital.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author campos
 */
@RestController
public class PersonaController {
    @Autowired
    private  PersonaRepository personaRepository;
    
    @Autowired
    private MedicoRepository medicoRepository;
    
    private Object PersonaRespository;
    
    @GetMapping(value  =  "/persona")
        public List <Personas> findAllPersonas(){
            List<Personas> persona = personaRepository.findAll();
            return persona;                                         
        }
    

    @GetMapping(value  =  "/medico")
        public List<Medico> findAllMedicos(){
            throw new NullPointerException("NPE Generado");
           // return MedicoRepository.findAll();
        }

  
    
}
