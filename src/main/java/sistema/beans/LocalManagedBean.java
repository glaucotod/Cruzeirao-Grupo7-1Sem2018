package sistema.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Local;

import java.util.ArrayList;
import java.util.List;


@ManagedBean
@SessionScoped
public class LocalManagedBean {
	
	private Local local = new Local();
	private ArrayList <Local> locais = new ArrayList<Local>();
	
	public void salvar() {
		locais.add(local);
		local = new Local();
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public List <Local> getLocais()
	{
		return locais;
	}
}