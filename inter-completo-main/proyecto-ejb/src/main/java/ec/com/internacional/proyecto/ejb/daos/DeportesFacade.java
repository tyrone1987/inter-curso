/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.internacional.proyecto.ejb.daos;

import ec.com.internacional.proyecto.ejb.Deportes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Tyrone
 */
@Stateless
public class DeportesFacade extends AbstractFacade<Deportes> implements DeportesFacadeLocal {

    @PersistenceContext(unitName = "deportesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DeportesFacade() {
        super(Deportes.class);
    }

}
