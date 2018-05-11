package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Juiz;

public class JuizService {

private EntityManagerFactory emf;
	
	public JuizService()
	{
	      emf = Persistence.createEntityManagerFactory("Cruzeirao_2018");
	}
	
	public void salvar(Juiz juiz)
	{
	    
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
			em.persist(juiz);
		em.getTransaction().commit();	
	    em.close();
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List <Juiz> getJuizes()
	{
		
		List <Juiz> juizes;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Juiz a");
		juizes = q.getResultList();
		em.close();
		
		return juizes;
		
	}
	
	
}

