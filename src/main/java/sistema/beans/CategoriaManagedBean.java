package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Categoria;

@ManagedBean
@SessionScoped
public class CategoriaManagedBean {

	private Categoria categoria = new Categoria();
	private ArrayList <Categoria> categorias = new ArrayList<Categoria>();

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void salvar() {
		categorias.add(categoria);
		categoria = new Categoria();
	}
	
	public List <Categoria> getCategorias()
	{
		return categorias;
	}
}
