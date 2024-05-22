package ec.com.banco.internacional.models;

public abstract class Persona {
	
	//tienen acceso desde cualquier lugar del proyecto
	public String variablePublica;
	
	//accesible solo de la misma clase
	//a menos q se agregue un modificador de acceso
	private int anioActual = 2024;
	
	private void obtenerAnio() {
		System.out.println(2024);
	}
	
	
	//estan disponibles desde la misma clase
	// y tambien desde las clases hijas
	protected double precio;
	
	protected void name() {
		System.out.println(anioActual);
	}
	
	//sin midificador
	//desde cualquier parte del paquete 
	// ej. ec.com.banco.internacional.models
	String apellido;
	
	int calcularSuma(int a , int b) {
		return a+b;
	}
}
