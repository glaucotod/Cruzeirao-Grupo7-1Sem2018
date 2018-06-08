package sistema.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Local;
import sistema.service.LocalService;

@ManagedBean(name = "LocalManagedBean")
@SessionScoped
public class LocalManagedBean {
	
	private Local local;
	private LocalService service = new LocalService();
	
	public void Salvar(){
		service.salvar(local);
		local = new Local();
		
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

}
