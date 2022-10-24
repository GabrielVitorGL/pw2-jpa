
package br.com.etechoracio.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.etechoracio.jpa.entity.Usuario;
import br.com.etechoracio.jpa.repository.UsuarioRepository;

@SpringBootApplication
public class Pw2JpaApplication implements CommandLineRunner{	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Pw2JpaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Usuario usuario = Usuario.builder().nome ("horacio.augusto")
										   .senha ("etec123")
								 .build();
		usuarioRepository.save (usuario);
	}
}