package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Categoria;


public class CategoriaService {

private EntityManagerFactory emf;
	
	public CategoriaService()
	{
	      emf = Persistence.createEntityManagerFactory("Cruzeirao_2018");
	}
	
	public void salvar(Categoria categoria)
	{
	    
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
			em.persist(categoria);
		em.getTransaction().commit();	
	    em.close();
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List <Categoria> getCategorias()
	{
		
		List <Categoria> categorias;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Categoria a");
		categorias = q.getResultList();
		em.close();
		
		return categorias;
		
	}
	
	
}

