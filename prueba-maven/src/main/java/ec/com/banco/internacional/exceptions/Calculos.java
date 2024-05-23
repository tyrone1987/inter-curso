package ec.com.banco.internacional.exceptions;

public class Calculos {
	public static double dividirPositivos(int a , int b) throws InterException {
		if(b==0) {
			throw InterException.divisionCero();
		}
		if(a < 1||b<1) {
			throw InterException.valorInvalido();
		}
		return a / b;
	}
}
