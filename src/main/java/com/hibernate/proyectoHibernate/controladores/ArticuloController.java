package com.hibernate.proyectoHibernate.controladores;

import com.hibernate.proyectoHibernate.entity.Articulos;
import com.hibernate.proyectoHibernate.repository.Repo_Articulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/articulos")
public class ArticuloController {

    @Autowired
    private Repo_Articulos repositorio;

    @GetMapping
    public List<Articulos> Consulta() {
        return (List<Articulos>) repositorio.findAll();
    }
}
