/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.internacional.proyecto.web.ui;

import ec.com.internacional.proyecto.ejb.Atleta;
import ec.com.internacional.proyecto.ejb.daos.AtletaFacadeLocal;
import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 *
 * @author Tyrone
 */
public class AtletaConverter implements Converter {

    @EJB
    private AtletaFacadeLocal jpaController;

    public Object getAsObject(FacesContext facesContext, UIComponent component, String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        Long id = new Long(string);
        AtletaController controller = (AtletaController) facesContext.getApplication().getELResolver().getValue(facesContext.getELContext(), null, "atleta");
        return jpaController.find(id);
    }

    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Atleta) {
            Atleta o = (Atleta) object;
            return o.getId() == null ? "" : o.getId().toString();
        } else {
            throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: ec.com.internacional.proyecto.ejb.Atleta");
        }
    }

}
