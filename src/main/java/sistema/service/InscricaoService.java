package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Inscricao;

public class InscricaoService {

private EntityManagerFactory emf;
	
	public InscricaoService()
	{
	      emf = Persistence.createEntityManagerFactory("Cruzeirao_2018");
	}
	
	public void salvar(Inscricao inscricao)
	{
	    
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
			em.persist(inscricao);
		em.getTransaction().commit();	
	    em.close();
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List <Inscricao> getInscricoes()
	{
		
		List <Inscricao> inscricoes;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Inscricao a");
		inscricoes = q.getResultList();
		em.close();
		
		return inscricoes;
		
	}
	
	
}


