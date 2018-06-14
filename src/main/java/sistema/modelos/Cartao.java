package sistema.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Cartao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private Inscrito inscrito;
	private EnumCartão tipo;
	private int tempo;
	
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
	public EnumCartão getTipo() {
		return tipo;
	}
	public void setTipo(EnumCartão tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Cartao [inscrito=" + inscrito + ", tipo=" + tipo + ", tempo=" + tempo + "]";
	}
	
	
}
