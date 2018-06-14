package sistema.service;

import java.util.List;

import sistema.dao.EquipeDAO;
import sistema.modelos.Equipe;
import sistema.modelos.Usuario;


public class EquipeService {

 	EquipeDAO equipeDAO = new EquipeDAO();
 	
 	public Equipe salvar(Equipe equipe){
		
		equipe = equipeDAO.salvar(equipe);
		equipeDAO.closeEntityManager();
		return equipe;
	}
	
	public List <Equipe> getEquipes()
	{
		List <Equipe> list =  equipeDAO.getAll(Equipe.class);
		equipeDAO.closeEntityManager();
		return list;
	}

	public void update(Equipe equipe)
	{
		equipeDAO.salvar(equipe);
		equipeDAO.closeEntityManager();
	}

	
	public void remove(Equipe equipe)
	{
		try{
		equipe = equipeDAO.getById(Equipe.class, equipe.getId());
		equipeDAO.remover(equipe);
		equipeDAO.closeEntityManager();
		}
		catch(Exception e){
			System.out.println("Erro ao tentar remover equipe" + equipe.getNome());
		}
	}
	
}
