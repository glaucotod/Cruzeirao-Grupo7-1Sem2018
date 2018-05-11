package sistema.modelos;

import java.util.List;

public class PartidaFutebol {
	
	private List<Gol> golsMandante;
	private List<Gol> golsVisitante;
	private List<Gol> golsPenaltisMandante;
	private List<Gol> golsPenaltisVisitantes;
	private List<Cartao> cartoesMandante;
	private List<Cartao> cartoesVisitantes;
	
	public List<Gol> getGolsMandante() {
		return golsMandante;
	}
	public void setGolsMandante(List<Gol> golsMandante) {
		this.golsMandante = golsMandante;
	}
	public List<Gol> getGolsVisitante() {
		return golsVisitante;
	}
	public void setGolsVisitante(List<Gol> golsVisitante) {
		this.golsVisitante = golsVisitante;
	}
	public List<Gol> getGolsPenaltisMandante() {
		return golsPenaltisMandante;
	}
	public void setGolsPenaltisMandante(List<Gol> golsPenaltisMandante) {
		this.golsPenaltisMandante = golsPenaltisMandante;
	}
	public List<Gol> getGolsPenaltisVisitantes() {
		return golsPenaltisVisitantes;
	}
	public void setGolsPenaltisVisitantes(List<Gol> golsPenaltisVisitantes) {
		this.golsPenaltisVisitantes = golsPenaltisVisitantes;
	}
	public List<Cartao> getCartoesMandante() {
		return cartoesMandante;
	}
	public void setCartoesMandante(List<Cartao> cartoesMandante) {
		this.cartoesMandante = cartoesMandante;
	}
	public List<Cartao> getCartoesVisitantes() {
		return cartoesVisitantes;
	}
	public void setCartoesVisitantes(List<Cartao> cartoesVisitantes) {
		this.cartoesVisitantes = cartoesVisitantes;
	}
	@Override
	public String toString() {
		return "PartidaFutebol [golsMandante=" + golsMandante + ", golsVisitante=" + golsVisitante
				+ ", golsPenaltisMandante=" + golsPenaltisMandante + ", golsPenaltisVisitantes="
				+ golsPenaltisVisitantes + ", cartoesMandante=" + cartoesMandante + ", cartoesVisitantes="
				+ cartoesVisitantes + "]";
	}
	
	
}
