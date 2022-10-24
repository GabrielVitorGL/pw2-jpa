package br.com.etechoracio.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.jpa.entity.GrupoUsuario;

public interface GrupoUsuarioRepository extends JpaRepository<GrupoUsuario, Long> {
	@Override
    List<GrupoUsuario> findAll();

}
