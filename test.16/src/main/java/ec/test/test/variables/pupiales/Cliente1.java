package ec.test.test.variables.pupiales;

public class Cliente1 {
 String nombre ;
 int año;
 
 public Cliente1(String nombre, int año) {
	super();
	this.nombre = nombre;
	this.año = año;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getAño() {
	return año;
}

public void setAño(int año) {
	this.año = año;
}

public String toString() {
		
	return nombre + " " + año ;
	
	 
 }
 
}
