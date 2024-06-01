/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.internacional.proyecto.ejb.daos;

import ec.com.internacional.proyecto.ejb.Atleta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Tyrone
 */
@Stateless
public class AtletaFacade extends AbstractFacade<Atleta> implements AtletaFacadeLocal {

    @PersistenceContext(unitName = "deportesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AtletaFacade() {
        super(Atleta.class);
    }

}
