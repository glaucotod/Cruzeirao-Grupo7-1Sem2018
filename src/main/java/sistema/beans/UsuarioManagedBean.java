package sistema.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.event.RowEditEvent;

import sistema.modelos.Campeonato;
import sistema.modelos.Equipe;
import sistema.modelos.Inscrito;
import sistema.modelos.Usuario;
import sistema.service.UsuarioService;
import java.util.List;


@ManagedBean
@SessionScoped
public class UsuarioManagedBean {
	
	private Usuario usuario = new Usuario();
	private List<Usuario> usuarios;
	private List<Usuario> diretores;
	private List<Usuario> juizes;
	private UsuarioService service = new UsuarioService();
	private Usuario usuarioSelecionado; 

	
	public void onRowEdit(RowEditEvent event) {

		Usuario a = ((Usuario) event.getObject());
		service.update(a);
	}
	
	public void salvar() {
		
		usuario = service.salvar(usuario);

		if (usuarios != null)
			usuarios.add(usuario);

		usuario = new Usuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public List<Usuario> getUsuarios(){
		if (usuarios == null)
			usuarios = service.getUsuarios();

		return usuarios	;
	}
	
	public List<Usuario> getJuizes()
	{
		if(juizes == null)
			juizes = service.getAllJuizes();
		return juizes;
	}
	public List<Usuario> getDiretores()
	{
		if(diretores == null)
			diretores = service.getAllDiretores();
		return diretores;
	}
	public Usuario getUsuarioSelecionado() {
		return usuarioSelecionado;
	}
	public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
		this.usuarioSelecionado = service.pesquisar(usuarioSelecionado);
	}
	public List<Equipe> getEquipesUsuario(){
		if(usuarioSelecionado != null)
			return service.pesquisarEquipesUsuario(usuarioSelecionado);
		else
			return null;
	}
	public List<Inscrito> getInscricoesUsuario(){
		if(usuarioSelecionado != null)
			return service.pesquisarInscritosUsuario(usuarioSelecionado);
		else
			return null;
	}
	public List<Campeonato> getCampeonatosUsuario(){
		if(usuarioSelecionado != null)
			return service.pesquisarCampeonatosUsuario(usuarioSelecionado);
		else
			return null;
	}
	
	
}
