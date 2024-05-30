package ec.test.inter.modelos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.test.inter.modelos.derby.Modulos;
import ec.test.inter.modelos.derby.Permiso;
import ec.test.inter.modelos.derby.dao.JPAUtil;
import ec.test.inter.modelos.derby.dao.JPAUtilMySQL;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager entityManager = JPAUtilMySQL.getEntityManager();

		try {
			entityManager.getTransaction().begin();
			Modulos module = new Modulos();
			module.setNombreModulo("mi modulo");
			
			/*inicio insert*/
			Permiso permiso = new Permiso();
			//permiso.setId(1);
			permiso.setNombre("mi permiso ultmoo");
			permiso.setModulo("el modulo");
			/*fin insert*/
			
			entityManager.persist(permiso);
			
			
			entityManager.getTransaction().commit();

			Query query = entityManager.createQuery("select p from Permiso p", Permiso.class);
			query.setMaxResults(5);
			
			@SuppressWarnings("unchecked")
			List<Permiso> permisos = query.getResultList();
			for (Permiso permiso2 : permisos) {
				System.out.println(permiso2);
			}

			//List<String> listado = entityManager.createNativeQuery("select * from permisos_users", "permisos_usuarios").getResultList();
			
			//Permiso perm = entityManager.find(Permiso.class, 6);
			//System.out.println(perm);
			entityManager.getTransaction().begin();
			//entityManager.remove(perm);
			entityManager.getTransaction().commit();
			entityManager.getTransaction().begin();
			//entityManager.createNativeQuery("update PERMISO set modulo = 'aqui no paso nada'")
			//.executeUpdate();
			entityManager.getTransaction().commit();
			JPAUtil.closeEtityManager(entityManager);
		} finally {
			JPAUtil.closeEtityManagerFactory();
		}

	}

}
