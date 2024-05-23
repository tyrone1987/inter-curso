package ec.test.test.variables.sentencias.cobos;

import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class CastingDatos {
	public static void main(String[] arg) {
		DecimalFormatSymbols d = DecimalFormatSymbols.getInstance();
		System.out.println("El numero debe estar separado por "  +d.getDecimalSeparator());
		Scanner lecturainfo = new Scanner(System.in);
		System.out.println("Ingrese el valor del producto: ");
		double opcion = lecturainfo.nextDouble();
		System.out.println("Ingrese el valor del descuento del producto: ");
		double opcion1 = lecturainfo.nextDouble();
		double resultado = opcion * 1/opcion1;
		Double e = Double.valueOf(resultado);
		System.out.println(e.doubleValue());
		
		
	}	
}
