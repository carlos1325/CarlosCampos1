
package com.seguritech.hospital.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.Subselect;

/**
 * @author campos
 */

@Entity
@Table(name = "personas")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_persona", discriminatorType = DiscriminatorType.STRING)
//@Filter(name = "borradoLogico", condition = "estado = 'HABILITADO' ")
@Subselect("select * from personas where estado = 'HABILITADO' ")

public abstract class Personas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "persona_id")
    private Long id;
    
    private String usuario;
    private String clave;
    private String nombre;
    
    @Column(name  = "e_mail")
    private String email;
    private String telefono;
    private Long obraSocialId;
    private Long especialidad;
    private String estado;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    public Long getId() {  return id; }
    public void setId(Long id)  {        this.id = id;    }

    public String getUsuario()  {        return usuario;    }
    public void setUsuario(String usuario)  {        this.usuario = usuario;    }

    public String getClave()  {        return clave;    }
    public void setClave(String clave)  {        this.clave = clave;    }

    public String getNombre()  {        return nombre;    }
    public void setNombre(String nombre)  {        this.nombre = nombre;    }

    public String getEmail()  {       return email;    }
    public void setEmail(String email)  {        this.email = email;    }

    public String getTelefono()  {        return telefono;    }
    public void setTelefono(String telefono)  {        this.telefono = telefono;   }

    public Long getObraSocialId()  {        return obraSocialId;    }
    public void setObraSocialId(Long obraSocialId)  {        this.obraSocialId = obraSocialId;    }

    public Long getEspecialidad()  {        return especialidad;   }
    public void setEspecialidad(Long especialidad)  {        this.especialidad = especialidad;     }

    public String getEstado()  {        return estado;    }
    public void setEstado(String estado)  {        this.estado = estado;    }

    public Date getFechaCreacion()  {        return fechaCreacion;    }
    public void setFechaCreacion(Date fechaCreacion)  {        this.fechaCreacion = fechaCreacion;    }
    
    
    
    
    
    
    
}
