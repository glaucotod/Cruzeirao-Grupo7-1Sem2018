package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Cartao;

public class CartaoService {

private EntityManagerFactory emf;
	
	public CartaoService()
	{
	      emf = Persistence.createEntityManagerFactory("Cruzeirao_2018");
	}
	
	public void salvar(Cartao cartao)
	{
	    
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
			em.persist(cartao);
		em.getTransaction().commit();	
	    em.close();
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List <Cartao> getCartoes()
	{
		
		List <Cartao> cartoes;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Cartao a");
		cartoes = q.getResultList();
		em.close();
		
		return cartoes;
		
	}
	
	
}

