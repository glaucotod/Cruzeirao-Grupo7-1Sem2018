package sistema.modelos;

import java.util.ArrayList;
import java.util.Date;

public class Campeonato {

	private String nome;
	private int ano;
	private ArrayList<Local> locais = new ArrayList<Local>();
	private ArrayList<Juiz> juizes= new ArrayList<Juiz>();
	private Date  dataInicioInscricao;
	private Date dataFimFimInscricao;
	private Date dataInicioCampeonato;
	private Date dataFimCampeonato;
	private double valorTaxa;
	private int minJogadores;
	private int maxJogadores;
	private int minTimeCat;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public ArrayList<Local> getLocais() {
		return locais;
	}
	public void setLocais(ArrayList<Local> locais) {
		this.locais = locais;
	}
	public ArrayList<Juiz> getJuizes() {
		return juizes;
	}
	public void setJuizes(ArrayList<Juiz> juizes) {
		this.juizes = juizes;
	}
	public Date getDataInicioInscricao() {
		return dataInicioInscricao;
	}
	public void setDataInicioInscricao(Date dataInicioInscricao) {
		this.dataInicioInscricao = dataInicioInscricao;
	}
	public Date getDataFimFimInscricao() {
		return dataFimFimInscricao;
	}
	public void setDataFimFimInscricao(Date dataFimFimInscricao) {
		this.dataFimFimInscricao = dataFimFimInscricao;
	}
	public Date getDataInicioCampeonato() {
		return dataInicioCampeonato;
	}
	public void setDataInicioCampeonato(Date dataInicioCampeonato) {
		this.dataInicioCampeonato = dataInicioCampeonato;
	}
	public Date getDataFimCampeonato() {
		return dataFimCampeonato;
	}
	public void setDataFimCampeonato(Date dataFimCampeonato) {
		this.dataFimCampeonato = dataFimCampeonato;
	}
	public double getValorTaxa() {
		return valorTaxa;
	}
	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
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
	public int getMinTimeCat() {
		return minTimeCat;
	}
	public void setMinTimeCat(int minTimeCat) {
		this.minTimeCat = minTimeCat;
	}	
}
