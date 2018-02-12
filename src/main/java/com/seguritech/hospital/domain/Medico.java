package com.seguritech.hospital.domain;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Enumerated;

/**
 * @author campos
 */

@Entity
@DiscriminatorValue(value = "MEDICO")
public class Medico extends Personas {
    
    @Column(name = "especialidad_id")
    @Enumerated
    private Especialidad especialidad;

    public Medico() {
    }

    public Medico(Especialidad especialidad) {
        this.especialidad = especialidad;
    }


    
    
}
