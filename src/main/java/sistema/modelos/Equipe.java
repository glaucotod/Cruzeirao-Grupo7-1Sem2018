package sistema.modelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Equipe {

	private String nome;

	private Date dataFundacao;
	private String cidade;

	private List<Usuario> diretores= new ArrayList<Usuario>();

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
	public void setDiretores(ArrayList<Usuario> diretores) {
		this.diretores = diretores;
	}
	
	
}
