package sistema.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gol {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private Inscrito inscrito;
	private int tempo;
	private boolean penalti;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Inscrito getInscrito() {
		return inscrito;
	}
	public void setInscrito(Inscrito inscrito) {
		this.inscrito = inscrito;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public boolean isPenalti() {
		return penalti;
	}
	public void setPenalti(boolean penalti) {
		this.penalti = penalti;
	}
	@Override
	public String toString() {
		return "Gol [inscrito=" + inscrito + ", tempo=" + tempo + ", penalti=" + penalti + "]";
	}
	
	
}
