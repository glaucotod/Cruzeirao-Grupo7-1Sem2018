package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Partida;
import sistema.service.PartidaService;

@ManagedBean
@SessionScoped
public class PartidaManagedBean {

	private Partida partida;
	private PartidaService service = new PartidaService();
	
	public void Salvar(){
		service.salvar(partida);
		partida = new Partida();
		
	}

	public Partida getPartida() {
		return partida;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public List<Partida> getPartidas() {
		return service.getPartidas();
	}
}
