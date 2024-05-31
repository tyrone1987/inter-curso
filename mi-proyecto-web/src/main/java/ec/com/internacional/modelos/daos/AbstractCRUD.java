/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.internacional.modelos.daos;

import java.util.List;

import javax.persistence.EntityManager;

/**
 *
 * @author Tyrone Lopez
 */
public abstract class AbstractCRUD<T> {

    private Class<T> entityClass;

    public AbstractCRUD(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    /*
    Sirve para crear registros
     */
    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    /*
    Sirve para editar registros
     */
    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    /*
    Sirve para eliminar
     */
    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    /*
    Sirve para crear buscar 1 por el id del registro
     */
    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    /*
    Sirve para buscar una lista
     */
    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    /*
    Sirve para buscar una lista entre un rago (0,10) (20,100)
     */
    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    /*
    sirve para contar el total de nuestra base
     */
    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }

}
