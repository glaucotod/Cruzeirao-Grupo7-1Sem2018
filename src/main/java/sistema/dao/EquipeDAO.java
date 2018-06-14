package sistema.dao;

import sistema.modelos.Equipe;
import sistema.dao.GenericDAO;

public class EquipeDAO extends GenericDAO<Equipe, Integer>{

	@Override
	protected Class<Equipe> getClasseEntidade() {
		return Equipe.class;
	}

}