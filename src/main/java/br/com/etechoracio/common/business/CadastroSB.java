package br.com.etechoracio.common.business;

import org.springframework.stereotype.Service;

import br.com.etechoracio.common.model.Cadastro;

@Service
public class CadastroSB {

	public void alter(Cadastro u) throws Exception {
		Cadastro nome = findByCodigoOrNome(u.getCodigo(), u.getNome());

	}

	private Cadastro findByCodigoOrNome(int codigo, String nome) throws Exception {
		if (nome == null) {
			throw new Exception("Não foi possível cadastrar esta Etec. Confira se o código está certo!");
		}
		return null;
	}

}
