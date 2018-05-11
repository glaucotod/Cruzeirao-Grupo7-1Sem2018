package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Local;

public class LocalService {

private EntityManagerFactory emf;
	
	public LocalService()
	{
	      emf = Persistence.createEntityManagerFactory("Cruzeirao_2018");
	}
	
	public void salvar(Local local)
	{
	    
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
			em.persist(local);
		em.getTransaction().commit();	
	    em.close();
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List <Local> getLocais()
	{
		
		List <Local> locais;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Local a");
		locais = q.getResultList();
		em.close();
		
		return locais;
		
	}
	
	
}

