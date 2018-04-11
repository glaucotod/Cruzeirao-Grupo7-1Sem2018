package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Equipe;

@ManagedBean
@SessionScoped
public class EquipeManagedBean {
	
	private Equipe equipe = new Equipe();
	private ArrayList <Equipe> equipes = new ArrayList<Equipe>();
	
	public void salvar() {
		equipes.add(equipe);
		equipe = new Equipe();
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public List <Equipe> getEquipes()
	{
		return equipes;
	}

}
