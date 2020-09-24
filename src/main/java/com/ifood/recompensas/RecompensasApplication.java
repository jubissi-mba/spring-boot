package com.ifood.recompensas;

import com.ifood.recompensas.domain.Produto;
import com.ifood.recompensas.service.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecompensasApplication implements CommandLineRunner {

	@Autowired
	private CatalogoService catalogoService;
	public static void main(String[] args) {
		SpringApplication.run(RecompensasApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		line();
		System.out.println("RecompensasApplication.run");
		System.out.println("Cadastrar Produto");
		Produto add1 = catalogoService.add("Pano de Prato", "Descricao 1", "50");
		Produto add2 = catalogoService.add("Cortador de Pizza", "Descricao 2", "150");
		Produto add3 = catalogoService.add("Jogo de Taças", "Descricao 3", "250");
		Produto add4 = catalogoService.add("Jogo de Hashis", "Descricao 4", "50");
		Produto add5 = catalogoService.add("Caneca", "Descricao 5", "100");
		Produto add6 = catalogoService.add("Portal Molhos", "Descricao 6", "250");
		System.out.println(add1);
		System.out.println(add2);
		System.out.println(add3);
		System.out.println(add4);
		System.out.println(add5);
		System.out.println(add6);
		line();
	}

	private void line() {
		System.out.println();
		System.out.println("______________________");
		System.out.println();
	}
}
