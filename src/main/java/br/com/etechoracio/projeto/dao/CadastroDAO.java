package br.com.etechoracio.projeto.dao;

import br.com.etechoracio.projeto.model.Cadastro;


public interface CadastroDAO extends BaseDAO<Cadastro> {

	public Cadastro findByCodigoOrNome(int codigo, String nome);
	
}
