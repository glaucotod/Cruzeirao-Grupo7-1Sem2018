package sistema.modelos;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equipe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nome;
	private Date dataFundacao;
	private String cidade;
	private List<Usuario> diretores;
	
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
	public Date getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public List<Usuario> getDiretores() {
		return diretores;
	}
	public void setDiretores(List<Usuario> diretores) {
		this.diretores = diretores;
	}
	@Override
	public String toString() {
		return "Equipe [nome=" + nome + ", dataFundacao=" + dataFundacao + ", cidade=" + cidade + ", diretores="
				+ diretores + "]";
	}
	
	
}
