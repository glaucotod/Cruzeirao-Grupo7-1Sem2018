package sistema.modelos;

public class Cartao {

	private Inscrito inscrito;
	private String tipo;
	private int Tempo;
	
	public Inscrito getInscrito() {
		return inscrito;
	}
	public void setInscrito(Inscrito inscrito) {
		this.inscrito = inscrito;
	}
	public int getTempo() {
		return Tempo;
	}
	public void setTempo(int tempo) {
		Tempo = tempo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
