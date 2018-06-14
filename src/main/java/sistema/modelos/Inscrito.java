package sistema.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "TabelaInscritos")
public class Inscrito implements Serializable { 	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "tipo")
	private String tipo;
	
	@JoinColumn(name = "usuario")
	@ManyToOne
	private Usuario usuario;
	
	@JoinColumn(name = "inscricao")
	@ManyToOne
	private Inscricao inscricao;
	
	@Column(name = "aceiteUsuario")
	private boolean aceiteUsuario;
	@Column(name = "suspensoJogos")
	private boolean suspensoJogos;
	@Column(name = "inscricaoValidada")
	private boolean inscricaoValidada;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Inscricao getInscricao() {
		return inscricao;
	}
	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}
	public boolean isAceiteUsuario() {
		return aceiteUsuario;
	}
	public void setAceiteUsuario(boolean aceiteUsuario) {
		this.aceiteUsuario = aceiteUsuario;
	}
	public boolean isSuspensoJogos() {
		return suspensoJogos;
	}
	public void setSuspensoJogos(boolean suspensoJogos) {
		this.suspensoJogos = suspensoJogos;
	}
	public boolean isInscricaoValidada() {
		return inscricaoValidada;
	}
	public void setInscricaoValidada(boolean inscricaoValidada) {
		this.inscricaoValidada = inscricaoValidada;
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
		Inscrito other = (Inscrito) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Inscrito [id=" + id + ", usuario=" + usuario + "]";
	}
	
	
	
}
