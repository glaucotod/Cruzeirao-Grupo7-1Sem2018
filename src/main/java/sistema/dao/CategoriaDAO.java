package sistema.dao;

import sistema.modelos.Categoria;
import sistema.dao.GenericDAO;

public class CategoriaDAO extends GenericDAO<Categoria, Integer>{

	@Override
	protected Class<Categoria> getClasseEntidade() {
		return Categoria.class;
	}

}