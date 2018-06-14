package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sistema.modelos.Campeonato;
import sistema.modelos.Juiz;
import sistema.modelos.Local;
import sistema.modelos.Usuario;
import sistema.service.CampeonatoService;
import sistema.service.LocalService;
import sistema.service.UsuarioService;

@ManagedBean
@SessionScoped
public class CampeonatoManagedBean {

	private Campeonato campeonato = new Campeonato();;
	private List<Campeonato> campeonatos;	
	private List<Campeonato> campeonatoSelecionados;
	private CampeonatoService service = new CampeonatoService();
	private Campeonato campeonatoSelecionado = new Campeonato();
	private Usuario usuario;
	private List<Usuario> usuarios;	
	private UsuarioService serviceUsuario = new UsuarioService();
	private Juiz juiz;
	private Local local;
	private LocalService localService = new LocalService();
	private List<Usuario> juizes;
	private List<Local> locais;
	
	
	
	public void salvar() {
		
		campeonato = service.salvar(campeonato);

		if (campeonatos != null)
			campeonatos.add(campeonato);

		campeonato = new Campeonato();
	}
	
	public void salvarSelecionado() {
		
		campeonatoSelecionado = service.salvar(campeonatoSelecionado);

		if (campeonatoSelecionados != null)
			campeonatoSelecionados.add(campeonatoSelecionado);

		
	}
	
	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	
	public List<Campeonato> getCampeonatos() {
		if (campeonatos == null)
			campeonatos = service.getCampeonatos();
		return campeonatos;
	}
	
	public List<Campeonato> getCampeonatoSelecionados() {
		if (campeonatoSelecionados == null)
			campeonatoSelecionados = service.getCampeonatos();
		return campeonatoSelecionados;
	}

	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}

	public Campeonato getCampeonatoSelecionado() {
		return campeonatoSelecionado;
	}

	public void setCampeonatoSelecionado(Campeonato campeonatoSelecionado) {
		this.campeonatoSelecionado = service.pesquisar(campeonatoSelecionado);
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		if (usuarios == null)
			usuarios = serviceUsuario.getUsuarios();
		return usuarios;
	}

	public UsuarioService getServiceUsuario() {
		return serviceUsuario;
	}

	public void setServiceUsuario(UsuarioService serviceUsuario) {
		this.serviceUsuario = serviceUsuario;
	}

	public Juiz getJuiz() {
		return juiz;
	}

	public List<Usuario> getJuizes()
	{
		if(juizes == null)
			juizes = serviceUsuario.getAllJuizes();
		return juizes;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public LocalService getLocalService() {
		return localService;
	}

	public void setLocalService(LocalService localService) {
		this.localService = localService;
	}
	
	public List<Local> getLocais() {
		if (locais == null)
			locais = localService.getLocais();
		return locais;
	}
	

//	public List<Juiz> getJuizes() {
//		if (juizes == null)
//			juizes = serviceUsuario.getAllJuizes();
//		return juizes;
//	}
	
	
	
	
	
	

	
	


}
