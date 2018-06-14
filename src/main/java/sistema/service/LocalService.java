package sistema.service;

import java.util.List;

import sistema.dao.LocalDAO;
import sistema.modelos.Campeonato;
import sistema.modelos.Local;
import sistema.modelos.Usuario;

public class LocalService {

 	LocalDAO localDAO = new LocalDAO();
 	
	public Local salvar(Local local)
	{
		local = localDAO.salvar(local);
		localDAO.closeEntityManager();
		return local;
		
	}
	
	public List <Local> getLocais()
	{
		List <Local> list = localDAO.getAll(Local.class);
		localDAO.closeEntityManager();
		return list;
	}

	public void alterar(Local local) {
		localDAO.salvar(local);
		localDAO.closeEntityManager();
	}

	
	public void remove(Local local)
	{
		try{
		local = localDAO.getById(Local.class, local.getId());
		localDAO.remover(local);
		localDAO.closeEntityManager();
		}
		catch(Exception e){
			System.out.println("Erro ao tentar remover usuário" + local.getEndereco());
		}
	}
	
	public Local pesquisar(Local local)
	{
		local = localDAO.getById(Local.class, local.getId());
		localDAO.closeEntityManager();
		return local;
	}
	
}
