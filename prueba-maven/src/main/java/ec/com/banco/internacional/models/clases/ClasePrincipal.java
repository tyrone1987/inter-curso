package ec.com.banco.internacional.models.clases;

import lombok.Getter;
import lombok.Setter;

public class ClasePrincipal {
	private static int variable1 = 10;
	private static int variable2 = 5;

	public void consultarAPiSRI() {
		String json = "";
	}
	
	
	@Getter
	@Setter
	static class ConsultaSRI {
		private String nombre;
		private String apellido;

	}

}
