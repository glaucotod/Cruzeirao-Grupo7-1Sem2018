package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Fase;
import sistema.service.FaseService;

@ManagedBean
@SessionScoped
public class FaseManagedBean {

	private Fase fase;
	private FaseService service = new FaseService();
	
	public void Salvar(){
		service.salvar(fase);
		fase = new Fase();
		
	}

	public Fase getFase() {
		return fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}

	public List<Fase> getFases() {
		return service.getFases();
	}
			

}
