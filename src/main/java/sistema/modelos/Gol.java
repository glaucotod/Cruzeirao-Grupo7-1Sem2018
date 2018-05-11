package sistema.modelos;

public class Gol {

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
	@Override
	public String toString() {
		return "Gol [inscrito=" + inscrito + ", tempo=" + tempo + ", penalti=" + penalti + "]";
	}
	
	
}
