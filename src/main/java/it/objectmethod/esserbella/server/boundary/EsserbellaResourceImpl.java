package it.objectmethod.esserbella.server.boundary;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import it.objectmethod.esserbella.client.rest.EsserbellaResource;
import it.objectmethod.esserbella.shared.entity.Operatore;

@Stateful
@SuppressWarnings("serial")
public class EsserbellaResourceImpl extends RemoteServiceServlet implements EsserbellaResource {

	@PersistenceContext
	EntityManager em = Persistence.createEntityManagerFactory("it.objectmethod.esserbella").createEntityManager();

	@POST
	//@Path("/insertOperatore")
	public void insertOperatore(@QueryParam("nome") String nome) {
		if (nome != null || !nome.equals("")) {
			Operatore op = new Operatore();
			op.setNome(nome);
			
			em.persist(op);
		}
	}

}
