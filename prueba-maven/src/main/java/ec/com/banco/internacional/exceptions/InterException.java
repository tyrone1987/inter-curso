package ec.com.banco.internacional.exceptions;

public class InterException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6576976126013153142L;

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
