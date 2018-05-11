package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Inscrito;
import sistema.service.InscritoService;

@ManagedBean
@SessionScoped
public class InscritoManagedBean {

	private Inscrito inscrito;
	private InscritoService service = new InscritoService();
	
	public void Salvar(){
		service.salvar(inscrito);
		inscrito = new Inscrito();
		
	}

	public Inscrito getInscrito() {
		return inscrito;
	}

	public void setInscrito(Inscrito inscrito) {
		this.inscrito = inscrito;
	}

	public List<Inscrito> getInscritos() {
		return service.getInscritos();
	}
}
