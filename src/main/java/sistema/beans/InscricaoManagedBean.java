package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sistema.modelos.Inscricao;

@ManagedBean
@SessionScoped
public class InscricaoManagedBean {
	
	private Inscricao inscricao = new Inscricao();
	private ArrayList <Inscricao> inscricoes = new ArrayList<Inscricao>();
	
	public void salvar() {
		inscricoes.add(inscricao);
		inscricao = new Inscricao();
	}

	public Inscricao getInscricao() {
		return inscricao;
	}

	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}

	public List <Inscricao> getInscricoes()
	{
		return inscricoes;
	}

}
