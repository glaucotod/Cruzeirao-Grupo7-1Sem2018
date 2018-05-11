package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Partida;

public class PartidaService {

private EntityManagerFactory emf;
	
	public PartidaService()
	{
	      emf = Persistence.createEntityManagerFactory("Cruzeirao_2018");
	}
	
	public void salvar(Partida partida)
	{
	    
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
			em.persist(partida);
		em.getTransaction().commit();	
	    em.close();
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List <Partida> getPartidas()
	{
		
		List <Partida> partidas;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Partida a");
		partidas = q.getResultList();
		em.close();
		
		return partidas;
		
	}
	
	
}

