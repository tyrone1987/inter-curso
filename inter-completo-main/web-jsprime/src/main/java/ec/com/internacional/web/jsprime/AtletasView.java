/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.internacional.web.jsprime;

import ec.com.internacional.proyecto.ejb.Atleta;
import ec.com.internacional.proyecto.ejb.daos.AtletaFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Tyrone
 */
@Named
@SessionScoped
public class AtletasView implements Serializable {

    @EJB
    private AtletaFacadeLocal atletaFacadeLocal;

    private List<Atleta> atletas;

    @PostConstruct
    public void init() {
        atletas = atletaFacadeLocal.findAll();
    }

    public List<Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(List<Atleta> atletas) {
        this.atletas = atletas;
    }

}
