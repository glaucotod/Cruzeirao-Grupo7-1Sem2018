package sistema.modelos;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Campeonato {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nome;
	
	@ManyToMany
    @JoinTable(
        name = "locais_campeonato",
        joinColumns = @JoinColumn(name = "id"),
        inverseJoinColumns = @JoinColumn(name = "id")
    )
	private List<Local> locais;
	
	private List<Juiz> juizes;
	private List<Categoria> categorias;
	private Date dataInicioInscricao;
	private Date dataFimInscricao;
	private Date dataInicioCampenato;
	private Date dataFimCampeonato;
	private Double valorTaixa;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Local> getLocais() {
		return locais;
	}
	public void setLocais(List<Local> locais) {
		this.locais = locais;
	}
	public List<Juiz> getJuizes() {
		return juizes;
	}
	public void setJuizes(List<Juiz> juizes) {
		this.juizes = juizes;
	}
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	public Date getDataInicioInscricao() {
		return dataInicioInscricao;
	}
	public void setDataInicioInscricao(Date dataInicioInscricao) {
		this.dataInicioInscricao = dataInicioInscricao;
	}
	public Date getDataFimInscricao() {
		return dataFimInscricao;
	}
	public void setDataFimInscricao(Date dataFimInscricao) {
		this.dataFimInscricao = dataFimInscricao;
	}
	public Date getDataInicioCampenato() {
		return dataInicioCampenato;
	}
	public void setDataInicioCampenato(Date dataInicioCampenato) {
		this.dataInicioCampenato = dataInicioCampenato;
	}
	public Date getDataFimCampeonato() {
		return dataFimCampeonato;
	}
	public void setDataFimCampeonato(Date dataFimCampeonato) {
		this.dataFimCampeonato = dataFimCampeonato;
	}
	public Double getValorTaixa() {
		return valorTaixa;
	}
	public void setValorTaixa(Double valorTaixa) {
		this.valorTaixa = valorTaixa;
	}
	
	@Override
	public String toString() {
		return "Campeonato [nome=" + nome + ", locais=" + locais + ", juizes=" + juizes + ", categorias=" + categorias
				+ ", dataInicioInscricao=" + dataInicioInscricao + ", dataFimInscricao=" + dataFimInscricao
				+ ", dataInicioCampenato=" + dataInicioCampenato + ", dataFimCampeonato=" + dataFimCampeonato
				+ ", valorTaixa=" + valorTaixa + "]";
	}
	
}
