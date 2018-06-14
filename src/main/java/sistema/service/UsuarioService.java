package sistema.service;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import sistema.dao.UsuarioDAO;
import sistema.modelos.Campeonato;
import sistema.modelos.Equipe;
import sistema.modelos.Inscrito;
import sistema.modelos.Usuario;



public class UsuarioService extends Service {
		
 	UsuarioDAO usuarioDAO = new UsuarioDAO();
 	
 	
 	public Usuario salvar(Usuario usuario){
		
		usuario = usuarioDAO.salvar(usuario);
		usuarioDAO.closeEntityManager();
		return usuario;
	}

	public List <Usuario> getUsuarios()
	{
		List <Usuario> list =  usuarioDAO.getAll(Usuario.class);
		usuarioDAO.closeEntityManager();
		return list;
	}
	
	
	public void update(Usuario usuario)
	{
		usuarioDAO.salvar(usuario);
		usuarioDAO.closeEntityManager();
	}
	
	
	public void remove(Usuario usuario)
	{
		try{
		usuario = usuarioDAO.getById(Usuario.class, usuario.getId());
		usuarioDAO.remover(usuario);
		usuarioDAO.closeEntityManager();
		}
		catch(Exception e){
			System.out.println("Erro ao tentar remover usuário" + usuario.getNome());
		}
	}
	
	public List<Equipe> pesquisarEquipesUsuario(Usuario usuario)
	{
		List<Equipe> equipes;
		usuario = usuarioDAO.getById(Usuario.class, usuario.getId());
		equipes = usuario.getEquipes();
		return equipes;
	}
	public List<Inscrito> pesquisarInscritosUsuario(Usuario usuario)
	{
		List<Inscrito> inscritos;
		usuario = usuarioDAO.getById(Usuario.class, usuario.getId());
		inscritos = usuario.getInscricoes();
		return inscritos;
	}
	public List<Campeonato> pesquisarCampeonatosUsuario(Usuario usuario)
	{
		List<Campeonato> campeonatos;
		usuario = usuarioDAO.getById(Usuario.class, usuario.getId());
		campeonatos = usuario.getCampeonatos();
		return campeonatos;
	}
	public List<Usuario> getAllJuizes()
	{
		List<Usuario> juizes = new ArrayList<Usuario>();
		List<Usuario> list = usuarioDAO.getAll(Usuario.class);
		for(Usuario u: list)
		{
			if(u.getTipoUsuario().equals("Juiz"))
				juizes.add(u);
		}
		return juizes;
	}
	public List<Usuario> getAllDiretores()
	{
		List<Usuario> diretores = new ArrayList<Usuario>();
		List<Usuario> list = usuarioDAO.getAll(Usuario.class);
		for(Usuario u: list)
		{
			if(u.getTipoUsuario().equals("Diretor"))
				diretores.add(u);
		}
		return diretores;
	}
	public Usuario pesquisar(Usuario usuario)
	{
		usuario = usuarioDAO.getById(Usuario.class, usuario.getId());
		usuarioDAO.closeEntityManager();
		return usuario;
	}

}