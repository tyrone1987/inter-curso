/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.internacional.modelos.daos;

import ec.com.internacional.modelos.Permiso;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Tyrone Lopez
 */
@Stateless
public class PermisoDAO extends AbstractCRUD<Permiso> {

    @PersistenceContext(unitName = "derbyPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PermisoDAO() {
        super(Permiso.class);
    }

    public List<Permiso> buscarPorNombre(String nombre) {
        Query createQuery = getEntityManager().createQuery("SELECT u FROM Permiso u where u.nombre like :parametro");
        createQuery.setParameter("parametro", "%" + nombre);
        return createQuery.getResultList();
    }

    public void updateMasivo() {
        getEntityManager().createQuery("UPDATE Permiso set nombre = 'asas' where nombre like '%a%'").executeUpdate();
    }

}
