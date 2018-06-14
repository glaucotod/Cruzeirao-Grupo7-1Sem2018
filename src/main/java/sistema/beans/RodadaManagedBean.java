package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Rodada;
import sistema.service.RodadaService;

@ManagedBean
@SessionScoped
public class RodadaManagedBean {

	private Rodada rodada;
	private RodadaService service = new RodadaService();
	
	public void Salvar(){
		service.salvar(rodada);
		rodada = new Rodada();
		
	}

	public Rodada getRodada() {
		return rodada;
	}

	public void setRodada(Rodada rodada) {
		this.rodada = rodada;
	}

	public List<Rodada> getRodadas() {
		return service.getRodadas();
	}
}
