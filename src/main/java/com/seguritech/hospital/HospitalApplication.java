package com.seguritech.hospital;

import com.seguritech.hospital.domain.Personas;
import com.seguritech.hospital.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableJpaRepositories("com.seguritech.hospital.repository")
@EnableTransactionManagement
public class HospitalApplication {
    
    @Autowired
    PersonaRepository usuarioRepository;

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }
    private PersonaRepository  personaRepository;
    
    
    @GetMapping(value = "/Personas")
    public List<Personas> findOne(){
        List<Personas> personas  = personaRepository.findAll();
        System.out.println(personas.size());
        return personas;
        
    }
    
    
    
}
