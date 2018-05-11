package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Campeonato;
import sistema.service.CampeonatoService;

@ManagedBean
@SessionScoped
public class CampeonatoManagedBean {
	
	private Campeonato campeonato;
	private CampeonatoService service = new CampeonatoService();
	
	public void Salvar(){
		service.salvar(campeonato);
		campeonato = new Campeonato();
		
	}

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public List<Campeonato> getCampeonatos() {
		return service.getCampeonatos();
	}
	
		

}
