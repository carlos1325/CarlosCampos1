package com.seguritech.hospital.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author campos
 */

@Entity
@DiscriminatorValue(value = "ADMINISTRADOR")
public class Administrador extends Personas {
    
    
}
