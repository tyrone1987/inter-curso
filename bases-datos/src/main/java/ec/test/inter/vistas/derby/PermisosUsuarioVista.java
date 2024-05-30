package ec.test.inter.vistas.derby;

public class PermisosUsuarioVista {
	private String nombre_permiso;
	private String nombre_usario;
	private Long id_user;

	public PermisosUsuarioVista(String nombre_permiso, String nombre_usario, Long id_user) {
		super();
		this.nombre_permiso = nombre_permiso;
		this.nombre_usario = nombre_usario;
		this.id_user = id_user;
	}

	public String getNombre_permiso() {
		return nombre_permiso;
	}

	public void setNombre_permiso(String nombre_permiso) {
		this.nombre_permiso = nombre_permiso;
	}

	public String getNombre_usario() {
		return nombre_usario;
	}

	public void setNombre_usario(String nombre_usario) {
		this.nombre_usario = nombre_usario;
	}

}
