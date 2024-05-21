package ec.test.test.variables.pupiales;

public abstract class Operacion {
 private int val1;
 private int val2;
 private double operacion;
 
 
public Operacion(int val1, int val2) {
	super();
	this.val1 = val1;
	this.val2 = val2;
}
public double getOperacion() {
	return operacion;
}
public void setOperacion(double operacion) {
	this.operacion = operacion;
}

 

 
 
}
