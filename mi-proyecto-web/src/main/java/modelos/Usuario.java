package modelos;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;



@SqlResultSetMapping(name = "permisos_usuarios", classes = {
		@ConstructorResult(targetClass = PermisosUsuarioVista.class, columns = {
				@ColumnResult(name = "nombre_permiso"), 
				@ColumnResult(name = "nombre"), 
				@ColumnResult(name = "id_user"),}) })
@Entity
public class Usuario {

	@Id
	private int id;

	private String nombre;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
