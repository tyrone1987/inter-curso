package ec.test.inter.modelos.derby.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final String PERSISTENCIA = "bancoPU";

	private static EntityManagerFactory emf;

	static {
		try {
			emf = Persistence.createEntityManagerFactory(PERSISTENCIA);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public static void closeEtityManager(EntityManager em) {
		if (em != null && em.isOpen())
			em.close();
	}

	public static void closeEtityManagerFactory() {
		if (emf != null && emf.isOpen())
			emf.close();
	}
	
}
