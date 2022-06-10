package br.edu.infnet.votaluanbruno.model.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(
		name = "TCandidato",
		uniqueConstraints = 
			@UniqueConstraint(columnNames={"numero"}) 
)

public class Candidato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private int numero;
	private String nome;
	
	@OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
	@JoinColumn(name="idCandidato")
	private List<Voto> votos; 
	
	@ManyToOne
	@JoinColumn(name="idEleicao")
	private Eleicao eleicao;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Voto> getVotos() {
		return votos;
	}
	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}
	public Eleicao getEleicao() {
		return eleicao;
	}
	public void setEleicao(Eleicao eleicao) {
		this.eleicao = eleicao;
	}
	
	
}
