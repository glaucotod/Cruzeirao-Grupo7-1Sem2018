package sistema.bean.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import sistema.beans.UsuarioManagedBean;
import sistema.modelos.Equipe;
import sistema.modelos.Usuario;
import sistema.service.EquipeService;
import sistema.service.UsuarioService;

@FacesConverter("diretorConverter")
public class DiretorConverter implements Converter{

	UsuarioService service = new UsuarioService();

	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {

		if (value != null && !value.isEmpty()) {
			for (Usuario u : service.getAllDiretores())
				if (u.getNome().equals(value))
					return u;
		}

		return null;
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic, Object usuario) {

		if (usuario == null || usuario.equals(""))
			return null;

		else
			return ((Usuario) usuario).getNome();
	}
}
