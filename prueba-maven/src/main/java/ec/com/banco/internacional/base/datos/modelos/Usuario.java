package ec.com.banco.internacional.base.datos.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Table(name = "users")
@Entity
public class Usuario {
	
	@Id
	@Column(name = "id_user")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name_user", length = 100)
	private String nombre;
	
	private String apellido;
	
	
}
