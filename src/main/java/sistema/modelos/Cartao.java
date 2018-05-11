package sistema.modelos;


public class Cartao {
	
	private Inscrito inscrito;
	private EnumCartão tipo;
	private int tempo;
	
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
