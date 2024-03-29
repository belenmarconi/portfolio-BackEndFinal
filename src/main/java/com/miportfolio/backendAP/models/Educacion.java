package com.miportfolio.backendAP.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    private Long idEduc;
    private String tituloEduc;
    private String institucionEduc;
    private String fechaEduc;
    private String estadoEduc;
    private String imagenEduc;
}
