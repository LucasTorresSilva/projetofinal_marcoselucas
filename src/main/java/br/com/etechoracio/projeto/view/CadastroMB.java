package br.com.etechoracio.projeto.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.etechoracio.projeto.business.CadastroSB;
import br.com.etechoracio.projeto.model.Cadastro;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Controller
@Scope("view")	
public class CadastroMB extends BaseMB{
     
	@Autowired
	private CadastroSB cadastroSB ;
	
	private Cadastro edi = new Cadastro();
	
	private List<Cadastro> listagem;
	
	public void onSave() {
		try {
			CadastroSB.save(edit);
			listagem = CadastroSB.findAll();
			showInsertMessage();
		}

		catch (Exception e) {
			showErrorMessage(e.getMessage());
		}
	}

	protected void postConstruct() {
		listagem = CadastroSB.findAll();
	}
	
	public void onRemove(Cadastro exclusao) {
		CadastroSB.remove(exclusao);
		listagem = CadastroSB.findAll();
		showDeleteMessage();
	}
	
	public void onUpdate(Cadastro cadastro){
		edit = cadastro;
	} 

	
}
