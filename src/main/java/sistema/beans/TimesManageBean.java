package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Time;
@ManagedBean
@SessionScoped
public class TimesManageBean {
	
	private ArrayList<Time> times = new ArrayList<Time>();
	private Time a = new Time("Facens");
	private Time b = new Time("ZN Importais");
	private Time c = new Time("Unip");
	private Time d = new Time("Votoran");
	private Time e = new Time("Sorocaba FC");
	private Time f = new Time("Piedade FC");
	private Time g = new Time("Votorantim FC");
	private Time h = new Time("Iguatemi FC");
	
	
	
	public void  setatimes(){
		this.times.add(a);
		this.times.add(b);
		this.times.add(c);
		this.times.add(d);
		this.times.add(e);
		this.times.add(f);
		this.times.add(g);
		this.times.add(h);
	}

	public List <Time> getTimes() {
		setatimes();
		return this.times;
	}


}
