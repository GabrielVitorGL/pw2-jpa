package br.com.etechoracio.jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_GRUPO_USUARIO")
public class GrupoUsuario {
	@Id
	@Column(name = "ID_GRUPO_USUARIO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "TX_NOME")
	private String nome;
	@Column(name = "DT_INICIO_VIGENCIA")
	private LocalDateTime dataInicioVigencia;
	@Column(name = "DT_FIM_VIGENCIA")
	private LocalDateTime dataFimVigencia;
}
