package ec.com.banco.internacional.exceptions;

public class InterException extends Exception {

	public InterException(String message) {
		super(message);
	}
	
	public static InterException divisionCero() {
		return InterException("No se shunsho");
	}

	public static InterException valorInvalido() {
		return InterException("El valor ingresado no es valido");
	}
	
	private static InterException InterException(String string) {
		// TODO Auto-generated method stub
		return new InterException(string);
	}
}
