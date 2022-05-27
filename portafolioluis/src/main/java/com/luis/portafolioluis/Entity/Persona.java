
package com.luis.portafolioluis.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.*;

@Getter @Setter
@Entity 

public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @NotNull 
    private String nombre;
    @NotNull 
    private String img;
    @NotNull 
    private String titulo;
}
