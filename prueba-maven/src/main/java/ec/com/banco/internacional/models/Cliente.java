package ec.com.banco.internacional.models;

import java.security.Security;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends Persona {

	private String nombre;
	
	@Getter
	private int edad;
	
	private String genero;
	
	@Getter
	private Date fehcaNacimiento;
	
	public void imprmir() {
		double y = super.precio;
		name();
		Security security;
	}
}
