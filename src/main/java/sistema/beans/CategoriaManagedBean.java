package sistema.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.event.RowEditEvent;
import sistema.modelos.Campeonato;
import sistema.modelos.Categoria;
import sistema.service.CampeonatoService;
import sistema.service.CategoriaService;
import org.primefaces.event.SelectEvent;

import java.util.List;


@ManagedBean
@SessionScoped
public class CategoriaManagedBean {
	
	private Categoria categoria = new Categoria();
	private List<Categoria> categorias;
	private CategoriaService service = new CategoriaService();
	private Campeonato campeonatoCategoria;
	private CampeonatoService campServ = new CampeonatoService();

	
	public void onRowEdit(RowEditEvent event) {

		Categoria a = ((Categoria) event.getObject());
		service.update(a);
	}
	
	public void salvar() {
		
		categoria = service.salvar(categoria);

		if (categorias != null)
			categorias.add(categoria);

		categoria = new Categoria();
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public List<Categoria> getCategorias(){
		if (categorias == null)
			categorias = service.getCategorias();

		return categorias ;
	}

	public Campeonato getCampeonatoCategoria() {
		return campeonatoCategoria;
	}

	public void setCampeonatoCategoria(Campeonato campeonatoCategoria) {
		this.campeonatoCategoria = campeonatoCategoria;
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

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	
	
	
	
}
