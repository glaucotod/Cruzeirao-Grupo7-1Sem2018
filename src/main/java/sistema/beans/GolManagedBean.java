package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Gol;
import sistema.service.GolService;

@ManagedBean
@SessionScoped
public class GolManagedBean {
	
	private Gol gol;
	private GolService service = new GolService();
	
	public void Salvar(){
		service.salvar(gol);
		gol = new Gol();
		
	}

	public Gol getGol() {
		return gol;
	}

	public void setGol(Gol gol) {
		this.gol = gol;
	}

	public List<Gol> getGols() {
		return service.getGols();
	}
	
}
