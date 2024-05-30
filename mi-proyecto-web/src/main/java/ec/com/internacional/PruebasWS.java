package ec.com.internacional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("prueba")
public class PruebasWS {
	@GET
	public Response saludar() {
		return Response.ok("Hola ").build();
	}
}
