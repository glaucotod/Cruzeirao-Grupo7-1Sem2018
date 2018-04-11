package sistema.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Juiz;

import java.util.ArrayList;
import java.util.List;


@ManagedBean
@SessionScoped
public class JuizManageBean {
	
	private Juiz juiz = new Juiz();
	private ArrayList <Juiz> juizes = new ArrayList<Juiz>();
	
	public void salvar() {
		juizes.add(juiz);
		juiz = new Juiz();
	}

	public Juiz getJuiz() {
		return juiz;
	}

	public void setJuiz(Juiz juiz) {
		this.juiz = juiz;
	}

	public List <Juiz> getJuizes()
	{
		return juizes;
	}
}
