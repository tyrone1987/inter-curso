package ec.test.test.variables.pupiales;

public class Excepciones extends Exception  {

	public Excepciones(String mensaje) {
		super(mensaje);
		// TODO Auto-generated constructor stub
	}

	public static double Excepciones divisionCero (){
		return Excepciones("Error division por cero");
	}

	private static Excepciones Excepciones(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
