package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Campeonato;
import sistema.modelos.Categoria;
import sistema.modelos.Inscricao;
import sistema.modelos.Inscrito;
import sistema.modelos.Usuario;
import sistema.service.CampeonatoService;
import sistema.service.CategoriaService;
import sistema.service.InscricaoService;

@ManagedBean
@SessionScoped
public class InscricaoManagedBean {

	private Inscricao inscricao = new Inscricao();
	private InscricaoService service = new InscricaoService();
	private List<Usuario> usuariosInscritos;
	private Categoria catInscricao;
	private CategoriaService catServ = new CategoriaService();
	private Campeonato campInscricao;
	private CampeonatoService campServ = new CampeonatoService();
	private List<Inscrito> inscritos= new ArrayList<Inscrito>();
	
	public void Salvar(){
		service.salvar(inscricao);
		inscricao = new Inscricao();		
	}

	public Inscricao getInscricao() {
		return inscricao;
	}

	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}

	public List<Inscricao> getInscricoes() {
		return service.getInscricoes();
	}

	public Categoria getCatInscricao() {
		return catInscricao;
	}

	public void setCatInscricao(Categoria catInscricao) {
		this.catInscricao = catInscricao;
	}

	public CategoriaService getCatServ() {
		return catServ;
	}
	
	public List<Categoria> getCategorias() {
		return catServ.getCategorias();
	}

	public void setCatServ(CategoriaService catServ) {
		this.catServ = catServ;
	}

	public Campeonato getCampInscricao() {
		return campInscricao;
	}

	public void setCampInscricao(Campeonato campInscricao) {
		this.campInscricao = campInscricao;
	}
	
	public List<Campeonato> getCampeonatos() {
		return campServ.getCampeonatos();
	}

	public CampeonatoService getCampServ() {
		return campServ;
	}

	public void setCampServ(CampeonatoService campServ) {
		this.campServ = campServ;
	}
	
	
}
