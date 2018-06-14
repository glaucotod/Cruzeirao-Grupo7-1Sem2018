package sistema.dao;

import sistema.modelos.Usuario;
import sistema.dao.GenericDAO;

public class UsuarioDAO extends GenericDAO<Usuario, Integer>{

	@Override
	protected Class<Usuario> getClasseEntidade() {
		return Usuario.class;
	}
	
	

}