package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Time;

@ManagedBean
@SessionScoped
public class TimeManagedBean {
	
	private Time time = new Time();
	private ArrayList <Time> times = new ArrayList<Time>();
	
	public void salvar() {
		times.add(time);
		time = new Time();
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public List <Time> getTimes()
	{
		return times;
	}

}
