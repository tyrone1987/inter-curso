package ec.test.inter.modelos.derby;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Modulos {
	@Id
	private long id;

	private String nombreModulo;

	@Column(name = "nombre_modulo_2", length = 50)
	private String nombreModulo2;

	public String getNombreModulo() {
		return nombreModulo;
	}

	public void setNombreModulo(String nombreModulo) {
		this.nombreModulo = nombreModulo;
	}

}
