package it.objectmethod.esserbella.server.boundary;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import it.objectmethod.esserbella.client.rest.EsserbellaResource;
import it.objectmethod.esserbella.server.connection.JPAUtility;
import it.objectmethod.esserbella.shared.entity.Operatore;

@Stateful
@SuppressWarnings("serial")
public class EsserbellaResourceImpl extends RemoteServiceServlet implements EsserbellaResource {

	//@PersistenceContext
	//EntityManager em = JPAUtility.getEntityManager();

	@POST
	//@Path("/insertOperatore")
	//@QueryParam("nome")
	public void insertOperatore(String nome) {
		
		EntityManager em = JPAUtility.getEntityManager();
		
		em.getTransaction().begin();
		
		if (nome != null) {
			Operatore op = new Operatore();
			op.setNome(nome);
			
			em.persist(op);
			
			em.getTransaction().commit();
			em.close();
		}
		
		JPAUtility.close();
		
	}

}
