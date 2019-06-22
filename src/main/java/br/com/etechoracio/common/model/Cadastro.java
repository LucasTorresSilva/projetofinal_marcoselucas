package br.com.etechoracio.common.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="cadastro")
public class Cadastro {

	@Column(name="nome")
	private String nome;
	
	@Column(name="codigo")
	@Id
	private int codigo;
	
	@Column(name="cep")
	private int cep ;
	
	@Column(name="endereco")
	private String endereco ;
	
	@Column(name="bairro")
	private String bairro ;
	
	@Column(name="cidade")
	private String cidade;
}
