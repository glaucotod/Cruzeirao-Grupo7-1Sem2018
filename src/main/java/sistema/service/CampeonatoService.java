package sistema.service;

import java.util.List;

import sistema.dao.CampeonatoDAO;
import sistema.modelos.Campeonato;
import sistema.modelos.Categoria;
import sistema.modelos.Juiz;
import sistema.modelos.Local;
import sistema.modelos.Usuario;


public class CampeonatoService {

	CampeonatoDAO campeonatoDAO = new CampeonatoDAO();

	public Campeonato salvar(Campeonato campeonato){

		campeonato = campeonatoDAO.salvar(campeonato);
		campeonatoDAO.closeEntityManager();
		return campeonato;
	}

	public List <Campeonato> getCampeonatos()
	{
		List <Campeonato> list =  campeonatoDAO.getAll(Campeonato.class);
		campeonatoDAO.closeEntityManager();
		return list;
	}

	public void update(Campeonato campeonato)
	{
		campeonatoDAO.salvar(campeonato);
		campeonatoDAO.closeEntityManager();
	}

	public void remove(Campeonato campeonato)
	{
		try{
			campeonato = campeonatoDAO.getById(Campeonato.class, campeonato.getId());
			campeonatoDAO.remover(campeonato);
			campeonatoDAO.closeEntityManager();
		}
		catch(Exception e){
			System.out.println("Erro ao tentar remover usuário" + campeonato.getNome());
		}
	}
	
	public Campeonato pesquisar(Campeonato campeonato)
	{
		campeonato = campeonatoDAO.getById(Campeonato.class, campeonato.getId());
		campeonatoDAO.closeEntityManager();
		return campeonato;
	}
	
	public List<Local> pesquisarLocaisCampeonato(Campeonato campeonato) 
	{
		List<Local> locais;
		campeonato = campeonatoDAO.getById(Campeonato.class, campeonato.getId());
		locais = campeonato.getLocais();
		return locais;
	}
	public List<Juiz> pesquisarJuizesCampeonato(Campeonato campeonato)
	{
		List<Juiz> juizes;
		campeonato = campeonatoDAO.getById(Campeonato.class, campeonato.getId());
		juizes = campeonato.getJuizes();
		return juizes;
	}
	public List<Categoria> pesquisarCategoriasCampeonato(Campeonato campeonato)
	{
		List <Categoria> categorias;
		campeonato = campeonatoDAO.getById(Campeonato.class, campeonato.getId());
		categorias = campeonato.getCategorias();
		return categorias;
	}

}
