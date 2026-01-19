package com.hibernate.proyectoHibernate;

import com.hibernate.proyectoHibernate.entity.Articulos;
import com.hibernate.proyectoHibernate.repository.Repo_Articulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProyectoHibernateApplication implements CommandLineRunner {

	@Autowired
	private Repo_Articulos repositorio;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoHibernateApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Aplicación iniciada correctamente");
		List<Articulos> articulos = repositorio.findAll();
		articulos.stream().forEach(System.out::println);
	}
}
