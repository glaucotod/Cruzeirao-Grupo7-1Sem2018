package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.PartidaFutebol;

public class PartidaFutebolService {

private EntityManagerFactory emf;
	
	public PartidaFutebolService()
	{
	      emf = Persistence.createEntityManagerFactory("Cruzeirao_2018");
	}
	
	public void salvar(PartidaFutebol partidaFutebol)
	{
	    
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
			em.persist(partidaFutebol);
		em.getTransaction().commit();	
	    em.close();
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List <PartidaFutebol> getPartidasFutebol()
	{
		
		List <PartidaFutebol> partidasFutebol;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From PartidaFutebol a");
		partidasFutebol = q.getResultList();
		em.close();
		
		return partidasFutebol;
		
	}
	
	
}


