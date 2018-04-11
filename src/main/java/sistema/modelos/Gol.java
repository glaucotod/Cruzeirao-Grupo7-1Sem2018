package sistema.modelos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Gol implements Serializable{

	private static final long serialVersionUID = 1L;

	private int codigoGol;
	
	private Inscrito inscrito;
	private int tempo;
	private boolean penalti;
	
	
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
	public int getCodigoGol() {
		return codigoGol;
	}
	public void setCodigoGol(int codigoGol) {
		this.codigoGol = codigoGol;
	}
	
}
