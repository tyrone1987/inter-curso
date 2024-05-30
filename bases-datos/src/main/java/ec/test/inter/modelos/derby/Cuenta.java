package ec.test.inter.modelos.derby;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cuenta {

	@Id
	private int id;
	
	@OneToOne
	@JoinColumn(name = "usuario_crea", referencedColumnName = "id")
	private Usuario usuarioCrea;
	
	@OneToOne
	@JoinColumn(name = "usuario_edita", referencedColumnName = "id")
	private Usuario usuarioEdita;
}
