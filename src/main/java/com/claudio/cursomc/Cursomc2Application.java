//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
package com.claudio.cursomc;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.claudio.cursomc.domain.Categoria;
import com.claudio.cursomc.repositeries.CategoriaRepository;

@SpringBootApplication
public class Cursomc2Application implements CommandLineRunner{

	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Cursomc2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		
	}

}
