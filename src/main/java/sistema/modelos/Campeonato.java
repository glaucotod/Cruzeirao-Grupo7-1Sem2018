package sistema.modelos;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "TabelaCampeonato")
public class Campeonato implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@OneToMany
	@JoinColumn(name = "id_local")
	private List<Local> locais;	
	
	@ManyToMany
	@JoinColumn(name = "id_juizes")
	private List<Juiz> juizes;
	
	@OneToMany
	@JoinColumn(name = "id_categoria")		
	private List<Categoria> categorias;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dataInicioInscricao")
	private Date dataInicioInscricao;

	@Temporal(TemporalType.DATE)
	@Column(name = "dataFimInscricao")
	private Date dataFimInscricao;

	@Temporal(TemporalType.DATE)
	@Column(name = "dataInicioCampeonato")
	private Date dataInicioCampeonato;

	@Temporal(TemporalType.DATE)
	@Column(name = "dataFimCampeonato")
	private Date dataFimCampeonato;
	
	@Column(name = "valorTaxa")
	private String valorTaxa;
	
	@Column(name = "anoCampeonato")
	private int anoCampeonato = Calendar.getInstance().get(Calendar.YEAR);
	
	

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

	public String getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(String valorTaxa) {
		this.valorTaxa = valorTaxa;
	}
	

	public int getAnoCampeonato() {
		return anoCampeonato;
	}

	public void setAnoCampeonato(int anoCampeonato) {
		this.anoCampeonato = anoCampeonato;
	}
	
	public void addLocal(Local local)
	{
		locais.add(local);
	}
	public void addJuiz(Juiz juiz)
	{
		juizes.add(juiz);
	}
	public void addCategoria(Categoria categoria)
	{
		categorias.add(categoria);
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
		Campeonato other = (Campeonato) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Campeonato [id=" + id + ", nome=" + nome + "]";
	}
	
	
	
}
