package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Equipe;
import sistema.modelos.Usuario;
import sistema.service.EquipeService;
import sistema.service.UsuarioService;

@ManagedBean
@SessionScoped
public class EquipeManagedBean {
	
	private Equipe equipe = new Equipe();
	private List<Equipe> equipes;
	private EquipeService service = new EquipeService();
	private Usuario diretor = new Usuario();
	private UsuarioService userService = new UsuarioService();
	
	
	
	public void salvar() {
		
		equipe = service.salvar(equipe);

		if (equipes != null)
			equipes.add(equipe);

		equipe = new Equipe();
	}

	public Equipe getEquipe() {
		return equipe;
	}
	
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	
	public List<Equipe> getEquipes(){
		if (equipes == null)
			equipes = service.getEquipes();

		return equipes	;
	}	

}
