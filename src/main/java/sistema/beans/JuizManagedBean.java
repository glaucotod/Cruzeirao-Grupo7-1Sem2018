//package sistema.beans;
//
//import java.util.List;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
//import org.primefaces.event.RowEditEvent;
//import sistema.modelos.Juiz;
//import sistema.service.JuizService;
//
//@ManagedBean
//@SessionScoped
//public class JuizManagedBean {
//	
//	private Juiz juiz;
//	private List<Juiz> juizes;
//	private JuizService service = new JuizService();
//	
//	public void onRowEdit(RowEditEvent event) {
//
//		Juiz a = ((Juiz) event.getObject());
//		service.update(a);
//	}
//	
//	public void salvar() {
//		
//		juiz = service.salvar(juiz);
//
//		if (juizes != null)
//			juizes.add(juiz);
//
//		juiz = new Juiz();
//	}
//
//	public Juiz getJuiz() {
//		return juiz;
//	}
//
//	public void setJuiz(Juiz juiz) {
//		this.juiz = juiz;
//	}
//	
//	public List<Juiz> getJuizs(){
//		if (juizes == null)
//			juizes = service.getJuizes();
//
//		return juizes	;
//	}
//}
