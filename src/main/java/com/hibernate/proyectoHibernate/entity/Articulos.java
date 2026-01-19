package com.hibernate.proyectoHibernate.entity;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;

@Entity
@Table(name = "articulos")

public class Articulos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre_articulo")
    private String nombreArticulo;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "existencia")
    private Integer existencia;

    @Override
    public String toString() {
        return "Articulo{"+
                "id: "+ id +
                ", nombreArticulo: '" + nombreArticulo + '\'' +
                ", precio: " + precio +
                ", existencia: " + existencia +
                '}';
    }
}
