package sistema.modelos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TabelaCategoria")
public class Categoria implements Serializable { 	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	@Column(name = "id")
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "nascidosAPartirDe")
	@Temporal(TemporalType.DATE)
	private Date nascidosAPartirDe;	
	
	@OneToMany
	@JoinColumn(name = "inscricoes")	
	private List<Inscricao> inscricoes;
	
	@ManyToOne
	@JoinColumn(name = "id_campeonato")
	private Campeonato campeonato;	
	
	@Column(name = "fases")
	private List<Fase> fases;	
		
	@Column(name = "sexo")
	private String sexo;
	
	@Column(name = "qtdMinJogadores")
	private int qtdMinJogadores;
	
	@Column(name = "qtdMaxJogadores")
	private int qtdMaxJogadores;
	
	@Column(name = "qtdMinTimesCat")
	private int qtdMinTimesCat;
	
	
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
	
	public Date getNascidosAPartirDe() {
		return nascidosAPartirDe;
	}
	
	public void setNascidosAPartirDe(Date nascidosAPartirDe) {
		this.nascidosAPartirDe = nascidosAPartirDe;
	}
	
	public List<Inscricao> getInscricoes() {
		return inscricoes;
	}
	
	public void setInscricoes(List<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
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
	
	

	public int getQtdMinJogadores() {
		return qtdMinJogadores;
	}

	public void setQtdMinJogadores(int qtdMinJogadores) {
		this.qtdMinJogadores = qtdMinJogadores;
	}

	public int getQtdMaxJogadores() {
		return qtdMaxJogadores;
	}

	public void setQtdMaxJogadores(int qtdMaxJogadores) {
		this.qtdMaxJogadores = qtdMaxJogadores;
	}

	public int getQtdMinTimesCat() {
		return qtdMinTimesCat;
	}

	public void setQtdMinTimesCat(int qtdMinTimesCat) {
		this.qtdMinTimesCat = qtdMinTimesCat;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void addInscricao(Inscricao inscricao)
	{
		inscricoes.add(inscricao);
	}
	public void addFase(Fase fase)
	{
		fases.add(fase);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nome=" + nome + "]";
	}
	
	
	
	
	
}
