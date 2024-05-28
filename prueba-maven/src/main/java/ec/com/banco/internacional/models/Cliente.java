package ec.com.banco.internacional.models;

import java.security.Security;
import java.util.Date;

public class Cliente extends Persona {

	private String nombre;

	private int edad;
	
	private String genero;
	
	private Date fehcaNacimiento;

	private Agencia agencia;
	
	public Cliente() {}
	
	public Cliente(String nombre, int edad, String genero, Date fehcaNacimiento, Agencia agencia) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.fehcaNacimiento = fehcaNacimiento;
		this.agencia = agencia;
	}



	public void imprmir() {
		double y = super.precio;
		name();
		Security security;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public Date getFehcaNacimiento() {
		return fehcaNacimiento;
	}



	public void setFehcaNacimiento(Date fehcaNacimiento) {
		this.fehcaNacimiento = fehcaNacimiento;
	}



	public Agencia getAgencia() {
		return agencia;
	}



	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}



	@Override
	public String toString() {
		return nombre + " " +edad;
	}

}
