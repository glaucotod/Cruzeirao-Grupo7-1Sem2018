package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Local;
import sistema.service.LocalService;

@ManagedBean
@SessionScoped
public class LocalManagedBean {
	
	private Local local = new Local();
	private LocalService service = new LocalService();
	private List<Local> locais;
	
	public void salvar() {

		local = service.salvar(local);

		if (locais != null)
			locais.add(local);

		local = new Local();
	}
	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}
	
	public List<Local> getLocais(){
		if (locais == null)
			locais = service.getLocais();

		return locais	;
	}	

}
