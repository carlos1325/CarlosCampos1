
package com.seguritech.hospital.domain;

import javax.persistence.Column;

/**
 * @author Werner
 */
public class Paciente  extends Personas {
    
    @Column(name = "obra_social_id")
    private Long obraSocialId;


    
}
