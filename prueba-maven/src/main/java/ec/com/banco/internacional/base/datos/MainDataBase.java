package ec.com.banco.internacional.base.datos;

public class MainDataBase {

	public static void main(String[] args) {
		try {

		// TODO Auto-generated method stub
		Conexion conexion = new Conexion();
		boolean isConected = conexion.conectar();
		if(isConected) {
			System.out.println("base conectada");
			try {
				conexion.crearTablaUsuario();	
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			conexion.insertarUsuario(5, "Pedro");
			conexion.listarUsuarios();
			conexion.eliminarUsuario(1);
			conexion.cerrarConexion();
		}else
		{
			System.out.println("base no conectada");
		}
		}catch (Exception e) {
			System.err.println(e);
			// TODO: handle exception
		}
	}

}
