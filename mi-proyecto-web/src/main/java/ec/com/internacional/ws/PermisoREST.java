/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.com.internacional.ws;

import ec.com.internacional.modelos.Permiso;
import ec.com.internacional.modelos.daos.PermisoDAO;
import ec.com.internacional.services.CuentasServices;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Tyrone Lopez
 */
@Stateless
@Path("permisos")
public class PermisoREST {

    @EJB
    private PermisoDAO permisoDAO;

    @EJB
    private CuentasServices cuentasServices;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Permiso> find() {
        return permisoDAO.findAll();
    }

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public Response crearPermiso(Permiso permiso) {
        boolean validarPermiso = cuentasServices.validarPermiso(permiso.getNombre());
        if (validarPermiso) {
            permisoDAO.create(permiso);
            return Response.ok(permiso).build();
        }
        return Response.status(403).build();
    }

}
