package sistema.dao;

import sistema.modelos.Juiz;
import sistema.dao.GenericDAO;

public class JuizDAO extends GenericDAO<Juiz, Integer>{

	@Override
	protected Class<Juiz> getClasseEntidade() {
		return Juiz.class;
	}

}