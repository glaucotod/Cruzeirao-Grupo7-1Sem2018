package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Inscrito;

public class InscritoService {

private EntityManagerFactory emf;
	
	public InscritoService()
	{
	      emf = Persistence.createEntityManagerFactory("Cruzeirao_2018");
	}
	
	public void salvar(Inscrito inscrito)
	{
	    
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
			em.persist(inscrito);
		em.getTransaction().commit();	
	    em.close();
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List <Inscrito> getInscritos()
	{
		
		List <Inscrito> inscritos;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Inscrito a");
		inscritos = q.getResultList();
		em.close();
		
		return inscritos;
		
	}
	
	
}

