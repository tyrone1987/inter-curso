/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.internacional.modelos.daos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.com.internacional.modelos.Usuario;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Tyrone Lopez
 */
@Stateless
public class UsuarioDAO extends AbstractCRUD<Usuario> {

    @PersistenceContext(unitName = "derbyPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioDAO() {
        super(Usuario.class);
    }

    public Usuario findCedula(String cedula) {
        try {
        Query createQuery = getEntityManager().createQuery("SELECT u FROM Usuario u WHERE u.cedula = :ced");
            createQuery.setParameter("ced", cedula);
            createQuery.setMaxResults(1);
            return (Usuario) createQuery.getSingleResult();
        } catch (Exception e) {

        }
        return null;
    }
}
