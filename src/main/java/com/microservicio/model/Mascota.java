package com.microservicio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "mascotas")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String raza;

    public Mascota() {
        
    }

    public Mascota(Long id, String nombre, String raza) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getRaza() { return raza; }
    public void setRaza(String raza) {this.raza = raza;}

}
