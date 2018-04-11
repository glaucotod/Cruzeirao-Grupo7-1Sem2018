package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sistema.modelos.Elenco;

@ManagedBean
@SessionScoped
public class ElencoManagedBean {
	
	private Elenco elenco = new Elenco();
	private ArrayList <Elenco> elencos = new ArrayList<Elenco>();
	
	public void salvar() {
		elencos.add(elenco);
		elenco = new Elenco();
	}

	public Elenco getElenco() {
		return elenco;
	}

	public void setElenco(Elenco elenco) {
		this.elenco = elenco;
	}

	public List <Elenco> getElencos()
	{
		return elencos;
	}

}
