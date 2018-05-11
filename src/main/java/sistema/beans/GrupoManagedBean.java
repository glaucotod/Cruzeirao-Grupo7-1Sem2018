package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Grupo;
import sistema.service.GrupoService;

@ManagedBean
@SessionScoped
public class GrupoManagedBean {

	private Grupo grupo;
	private GrupoService service = new GrupoService();
	
	public void Salvar(){
		service.salvar(grupo);
		grupo = new Grupo();
		
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public List<Grupo> getGrupos() {
		return service.getGrupos();
	}
}
