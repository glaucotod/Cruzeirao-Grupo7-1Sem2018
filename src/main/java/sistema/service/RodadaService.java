package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Rodada;

public class RodadaService {

private EntityManagerFactory emf;
	
	public RodadaService()
	{
	      emf = Persistence.createEntityManagerFactory("Cruzeirao_2018");
	}
	
	public void salvar(Rodada rodada)
	{
	    
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
			em.persist(rodada);
		em.getTransaction().commit();	
	    em.close();
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List <Rodada> getRodadas()
	{
		
		List <Rodada> rodadas;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Rodada a");
		rodadas = q.getResultList();
		em.close();
		
		return rodadas;
		
	}
	
	
}
