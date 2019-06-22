package br.com.etechoracio.projeto.business;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.etechoracio.projeto.dao.CadastroDAO;
import br.com.etechoracio.projeto.model.Cadastro;




@Service
public class CadastroSB extends BaseSB {
	
	private CadastroDAO cadastroDAO;
	
	@Override
	protected void postConstructImpl() {
		cadastroDAO = getDAO(CadastroDAO.class);
		
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void save(Cadastro cadastro) throws Exception {
		Cadastro r = cadastroDAO.findByIdOrNome(cadastro.getId(), cadastro.getNome());
		
		if (r == null) {
			cadastroDAO.save(cadastro);
		}
		
		else {
			throw new Exception("Existe registro com mesmo código ou nome");
		}
	}
	
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<Cadastro> findAll() {
		return cadastroDAO.findAll();
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void remove(Cadastro exclusao) {
		cadastroDAO.delete(exclusao);
	}
	
	

}

