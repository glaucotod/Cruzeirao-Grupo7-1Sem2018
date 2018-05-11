package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Cartao;
import sistema.service.CartaoService;

@ManagedBean
@SessionScoped
public class CartaoManagedBean {

	private Cartao cartao;
	private CartaoService service = new CartaoService();
	
	public void Salvar(){
		service.salvar(cartao);
		cartao = new Cartao();
		
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public List<Cartao> getCartoes() {
		return service.getCartoes();
	}
	
		

}
