package ec.com.banco.internacional.base.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

	private String dbUrl = "jdbc:derby:CursoInterDb;create=true";

	// private String dbUrl = "jdbc:mysql//192.0.0.0:1433:database";

	private Connection conn;

	public boolean conectar() throws ClassNotFoundException {
		try {

			// DriverManager.getConnection(dbUrl, "usu", "cont");
			conn = DriverManager.getConnection(dbUrl);
			return conn != null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public void crearTablaUsuario() {
		try {
			if (conn != null) {
				Statement statement = conn.createStatement();
				boolean ex = statement.execute("create table users(id int primary key, name varchar(100))");
				boolean expermisos = statement.execute("create table permisos(id int primary key, name varchar(100))");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertarUsuario(int id, String name) {
		String conmmad = "insert into users(id,name) values(" + id + ",'" + name + "')";
		System.out.println(conmmad);
		try {
			 conn.createStatement().execute(conmmad);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	//delete from users where id = 1 or 1 = 1
	
	public void eliminarUsuario(int id) {
		String conmmad = "delete from users where id = " + id;
		System.out.println(conmmad);
		try {
			 conn.createStatement().execute(conmmad);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void listarUsuarios() {
		try {
			ResultSet rs = conn.createStatement().executeQuery("select id,name from users");
			while (rs.next()) {
				System.out.println("id: " + rs.getInt("id") + " nombre " + rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertarPermiso(int id, String name) {
		String conmmad = "insert into permisos(id,name) values(" + id + ",'" + name + "')";
		System.out.println(conmmad);
		try {
			 conn.createStatement().execute(conmmad);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	//delete from users where id = 1 or 1 = 1
	
	public void eliminarPermiso(int id) {
		String conmmad = "delete from permiso where id = " + id;
		System.out.println(conmmad);
		try {
			 conn.createStatement().execute(conmmad);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void listarPermisos() {
		try {
			ResultSet rs = conn.createStatement().executeQuery("select id,name from permisos");
			while (rs.next()) {
				System.out.println("id: " + rs.getInt("id") + " nombre " + rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void cerrarConexion() {
		try {
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
