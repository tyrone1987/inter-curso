package ec.test.inter.modelos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.test.inter.modelos.derby.Modulos;
import ec.test.inter.modelos.derby.Permiso;
import ec.test.inter.modelos.derby.dao.JPAUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager entityManager = JPAUtil.getEntityManager();

		try {
			Modulos module = new Modulos();
			module.setNombreModulo("mi modulo");
			Permiso permiso = new Permiso();
			
			permiso.setNombre("mi permiso ultmoo");

			entityManager.getTransaction().begin();
			entityManager.persist(permiso);
			entityManager.getTransaction().commit();

			Query query = entityManager.createQuery("select p from Permiso p", Permiso.class);
			List<Permiso> permisos = query.getResultList();
			for (Permiso permiso2 : permisos) {
				System.out.println(permiso2);
			}

			JPAUtil.closeEtityManager(entityManager);
		} finally {
			JPAUtil.closeEtityManagerFactory();
		}

	}

}
