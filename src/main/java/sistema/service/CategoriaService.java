package sistema.service;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import sistema.dao.CategoriaDAO;
import sistema.modelos.Campeonato;
import sistema.modelos.Categoria;



public class CategoriaService {

 	CategoriaDAO categoriaDAO = new CategoriaDAO();
 	
 	public Categoria salvar(Categoria categoria){
		
		categoria = categoriaDAO.salvar(categoria);
		categoriaDAO.closeEntityManager();
		return categoria;
	}

	public List <Categoria> getCategorias()
	{
		List <Categoria> list =  categoriaDAO.getAll(Categoria.class);
		categoriaDAO.closeEntityManager();
		return list;
	}
	public void update(Categoria categoria)
	{
		categoriaDAO.salvar(categoria);
		categoriaDAO.closeEntityManager();
	}
	public void remove(Categoria categoria)
	{
		try{
		categoria = categoriaDAO.getById(Categoria.class, categoria.getId());
		categoriaDAO.remover(categoria);
		categoriaDAO.closeEntityManager();
		}
		catch(Exception e){
			System.out.println("Erro ao tentar remover categoria" + categoria.getNome());
		}
	}
	public Categoria pesquisar(Categoria categoria)
	{
		categoria = categoriaDAO.getById(Categoria.class, categoria.getId());
		categoriaDAO.closeEntityManager();
		return categoria;
	}
	public Campeonato pesquisarCampeonatoCategoria(Categoria categoria)
	{
		Campeonato campeonato;
		categoria = categoriaDAO.getById(Categoria.class, categoria.getId());
		campeonato = categoria.getCampeonato();
		return campeonato;
	}
	
	
}