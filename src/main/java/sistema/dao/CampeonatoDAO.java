package sistema.dao;

import sistema.modelos.Campeonato;
import sistema.dao.GenericDAO;

public class CampeonatoDAO extends GenericDAO<Campeonato, Integer>{

	@Override
	protected Class<Campeonato> getClasseEntidade() {
		return Campeonato.class;
	}

}

