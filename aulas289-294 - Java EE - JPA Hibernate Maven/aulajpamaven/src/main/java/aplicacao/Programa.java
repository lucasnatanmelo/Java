package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null , "Ana Marina", "ana@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();	
		
		// Initialize DB transactions
		em.getTransaction().begin();
		
		// Person Insertion in DB 
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		// Find a person in DB
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		
		// Delete person in DB
		// Entidade monitorada -> Primeiro recuperar no banco de dados, para depois deletar
		em.remove(p);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		System.out.println("Pronto! ");
	}
}