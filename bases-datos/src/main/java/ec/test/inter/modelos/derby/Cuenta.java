package ec.test.inter.modelos.derby;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Cuenta {

	@OneToOne
	@JoinColumn(name = "usuario_crea", referencedColumnName = "id")
	private Usuario usuarioCrea;
	
	@OneToOne
	@JoinColumn(name = "usuario_edita", referencedColumnName = "id")
	private Usuario usuarioEdita;
}
