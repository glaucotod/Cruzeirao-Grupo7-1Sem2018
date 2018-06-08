package sistema.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Local {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String endereco;
	
	

	public Local() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Local [endereco=" + endereco + "]";
	}
	
	
}
