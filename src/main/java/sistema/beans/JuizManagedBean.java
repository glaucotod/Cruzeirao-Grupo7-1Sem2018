package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Juiz;
import sistema.service.JuizService;

@ManagedBean
@SessionScoped
public class JuizManagedBean {
	
	private Juiz juiz;
	private JuizService service = new JuizService();
	
	public void Salvar(){
		service.salvar(juiz);
		juiz = new Juiz();
		
	}

	public Juiz getJuiz() {
		return juiz;
	}

	public void setJuiz(Juiz juiz) {
		this.juiz = juiz;
	}

	public List<Juiz> getJuizes() {
		return service.getJuizes();
	}
}
