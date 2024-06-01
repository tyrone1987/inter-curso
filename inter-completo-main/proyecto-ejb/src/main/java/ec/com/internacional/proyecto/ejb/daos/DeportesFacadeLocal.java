/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.com.internacional.proyecto.ejb.daos;

import ec.com.internacional.proyecto.ejb.Deportes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Tyrone
 */
@Local
public interface DeportesFacadeLocal {

    void create(Deportes deportes);

    void edit(Deportes deportes);

    void remove(Deportes deportes);

    Deportes find(Object id);

    List<Deportes> findAll();

    List<Deportes> findRange(int[] range);

    int count();

}
