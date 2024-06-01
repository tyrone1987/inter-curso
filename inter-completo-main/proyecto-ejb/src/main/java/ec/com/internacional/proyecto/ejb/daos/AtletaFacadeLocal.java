/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.com.internacional.proyecto.ejb.daos;

import ec.com.internacional.proyecto.ejb.Atleta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Tyrone
 */
@Local
public interface AtletaFacadeLocal {

    void create(Atleta atleta);

    void edit(Atleta atleta);

    void remove(Atleta atleta);

    Atleta find(Object id);

    List<Atleta> findAll();

    List<Atleta> findRange(int[] range);

    int count();

}
