package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Grupo;

public class GrupoService {

private EntityManagerFactory emf;
	
	public GrupoService()
	{
	      emf = Persistence.createEntityManagerFactory("Cruzeirao_2018");
	}
	
	public void salvar(Grupo grupo)
	{
	    
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
			em.persist(grupo);
		em.getTransaction().commit();	
	    em.close();
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List <Grupo> getGrupos()
	{
		
		List <Grupo> grupos;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Grupo a");
		grupos = q.getResultList();
		em.close();
		
		return grupos;
		
	}
	
	
}


