package com.tuempresa.facturacion.modelo;

import javax.persistence.*;
import org.openxava.annotations.*;
import lombok.*;

@Entity
@Getter @Setter
public class Cliente {

    @Id
    @Column(length = 6)
    int numero;

    @Column(length = 50)
    @Required
    String nombre;

    @Embeddable // Usamos @Embeddable en vez de @Entity
    @Getter
    @Setter
    public class Direccion {

        @Column(length = 30) // Los miembros se anotan igual que en las entidades
        String viaPublica;

        @Column(length = 5)
        int codigoPostal;

        @Column(length = 20)
        String municipio;

        @Column(length = 30)
        String provincia;
    }
    @Embedded // Así para referenciar a una clase incrustable
    Direccion direccion; // Una referencia Java convencional
}


