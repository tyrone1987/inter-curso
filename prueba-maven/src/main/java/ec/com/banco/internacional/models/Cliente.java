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

	@Getter
	@Setter
	private String nombre;

	@Getter
	@Setter
	private int edad;
	
	@Getter
	@Setter
	private String genero;
	
	@Getter
	@Setter
	private Date fehcaNacimiento;
	
	@Getter
	@Setter
	private Agencia agencia;
	
	public void imprmir() {
		double y = super.precio;
		name();
		Security security;
	}
	
	@Override
	public String toString() {
		return nombre + " " +edad;
	}

}
