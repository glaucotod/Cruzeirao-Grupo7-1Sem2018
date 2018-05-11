package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Gol;

public class GolService {

private EntityManagerFactory emf;
	
	public GolService()
	{
	      emf = Persistence.createEntityManagerFactory("Cruzeirao_2018");
	}
	
	public void salvar(Gol gol)
	{
	    
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
			em.persist(gol);
		em.getTransaction().commit();	
	    em.close();
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List <Gol> getGols()
	{
		
		List <Gol> gols;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Gol a");
		gols = q.getResultList();
		em.close();
		
		return gols;
		
	}
	
	
}

