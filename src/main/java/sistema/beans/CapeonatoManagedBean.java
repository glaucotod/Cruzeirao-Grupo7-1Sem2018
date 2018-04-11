package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.*;

import sistema.modelos.Campeonato;

@ManagedBean
@SessionScoped
public class CapeonatoManagedBean {
	
	private Campeonato campeonato = new Campeonato();
	private ArrayList <Campeonato> campeonatos = new ArrayList<Campeonato>();
	
	public void salvar() {
		campeonatos.add(campeonato);
		campeonato = new Campeonato();
	}

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public List <Campeonato> getCampeonatos()
	{
		return campeonatos;
	}

}
