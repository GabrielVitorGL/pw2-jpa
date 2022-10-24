
package br.com.etechoracio.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import br.com.etechoracio.jpa.entity.GrupoUsuario;
import br.com.etechoracio.jpa.entity.Usuario;
import br.com.etechoracio.jpa.repository.GrupoUsuarioRepository;
import br.com.etechoracio.jpa.repository.UsuarioRepository;

@SpringBootApplication
public class Pw2JpaApplication implements CommandLineRunner{	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private GrupoUsuarioRepository grupoUsuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Pw2JpaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		/*
		Usuario usuario = Usuario.builder().nome ("horacio.augusto")
										   .senha ("etec123")
								 .build();
		usuarioRepository.save (usuario);
		*/
		LocalDateTime now = LocalDateTime.now();
		List <GrupoUsuario> grupos = Arrays.asList(
				GrupoUsuario.builder().nome ("História")
					.dataFimVigencia(now.plusYears(1))
					.dataInicioVigencia(now)
					.build(),
				GrupoUsuario.builder().nome ("English")
					.dataFimVigencia(now.plusYears(1))
					.dataInicioVigencia(now)
					.build()
		);
		grupoUsuarioRepository.saveAll (grupos);
	}
}