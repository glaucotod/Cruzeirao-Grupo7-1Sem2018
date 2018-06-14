package sistema.bean.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import sistema.modelos.Local;
import sistema.service.LocalService;

@FacesConverter("localConverter")
public class LocalConverter implements Converter {

	LocalService service = new LocalService();

	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {

		if (value != null && !value.isEmpty()) {
			for (Local c : service.getLocais())
				if (c.getEndereco().equals(value))
					return c;
		}

		return null;
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic, Object local) {

		if (local == null || local.equals(""))
			return null;

		else
			return ((Local) local).getEndereco();
	}
}
