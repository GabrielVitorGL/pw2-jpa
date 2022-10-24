package br.com.etechoracio.jpa.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Builder
@Table(name = "TBL_USUARIO")
	public class Usuario {
	@Id
	@Column(name = "ID_USUARIO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "TX_NOME")
	private String nome;
	@Column(name = "TX_SENHA")
	private String senha;	
	@Column(name = "DT_INATIVACAO")
	private LocalDateTime dataInativacao;
	@ManyToMany
	@JoinTable(name = "TBL_REL_USUARIO_GRUPO",joinColumns = @JoinColumn(name = "ID_GRUPO_USUARIO "),
	inverseJoinColumns = @JoinColumn (name =  "ID_USUARIO")) 
	private List<GrupoUsuario>grupos;
}
 
