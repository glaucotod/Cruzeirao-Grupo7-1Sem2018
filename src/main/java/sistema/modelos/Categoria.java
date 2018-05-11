package sistema.modelos;

import java.util.List;

public class Categoria {

	private String nome;
	private int nascidosAPartirDe;
	private List<Inscrito> inscritos;
	private Campeonato campeonato;
	private List<Fase> fases;
	private int minJogadores;
	private int maxJogadores;
	private EnumSexo Sexo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNascidosAPartirDe() {
		return nascidosAPartirDe;
	}
	public void setNascidosAPartirDe(int nascidosAPartirDe) {
		this.nascidosAPartirDe = nascidosAPartirDe;
	}
	public List<Inscrito> getInscritos() {
		return inscritos;
	}
	public void setInscritos(List<Inscrito> inscritos) {
		this.inscritos = inscritos;
	}
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	public List<Fase> getFases() {
		return fases;
	}
	public void setFases(List<Fase> fases) {
		this.fases = fases;
	}
	public int getMinJogadores() {
		return minJogadores;
	}
	public void setMinJogadores(int minJogadores) {
		this.minJogadores = minJogadores;
	}
	public int getMaxJogadores() {
		return maxJogadores;
	}
	public void setMaxJogadores(int maxJogadores) {
		this.maxJogadores = maxJogadores;
	}
	public EnumSexo getSexo() {
		return Sexo;
	}
	public void setSexo(EnumSexo sexo) {
		Sexo = sexo;
	}
	@Override
	public String toString() {
		return "Categoria [nome=" + nome + ", nascidosAPartirDe=" + nascidosAPartirDe + ", inscritos=" + inscritos
				+ ", campeonato=" + campeonato + ", fases=" + fases + ", minJogadores=" + minJogadores
				+ ", maxJogadores=" + maxJogadores + ", Sexo=" + Sexo + "]";
	}
	
	
}
