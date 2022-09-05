package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name = "TBL_VEICULO")

public class Veliculo {
	@Id
	@Column(name = "ID_VEICULO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "TX_FABRICANTE")
	private String fabricante;
	@Column(name = "TX_MODELO")
	private String modelo;
	@Column(name = "NR_ANO_FABRICACAO")
	private Integer anoFabricacao;
	@Column(name = "NR_ANO_MODELO")
	private Integer anoModelo;
	@Column(name = "VLR_PRECO")
	private Double valor;
}
