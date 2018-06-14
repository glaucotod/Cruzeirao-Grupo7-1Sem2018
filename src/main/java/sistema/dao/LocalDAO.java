package sistema.dao;

import sistema.dao.GenericDAO;
import sistema.modelos.Local;

public class LocalDAO extends GenericDAO<Local, Integer>{

	@Override
	protected Class<Local> getClasseEntidade() {
		return Local.class;
	}
}
