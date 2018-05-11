package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Equipe;
import sistema.service.EquipeService;

@ManagedBean
@SessionScoped
public class EquipeManagedBean {
	
	private Equipe equipe;
	private EquipeService service = new EquipeService();
	
	public void Salvar(){
		service.salvar(equipe);
		equipe = new Equipe();
		
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public List<Equipe> getEquipes() {
		return service.getEquipes();
	}
	

}
