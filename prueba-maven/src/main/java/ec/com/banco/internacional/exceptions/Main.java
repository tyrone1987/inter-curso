package ec.com.banco.internacional.exceptions;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] arg) {

		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Proceso " + i);
				Date fecha = new Date();
				SimpleDateFormat asd = new SimpleDateFormat("dd/MM/yyyy HH:mm");
				System.out.println(asd.format(fecha));
				System.out.println(asd.parse("12/01/2025 12:00"));
				Integer numer = Integer.valueOf("0");
				Calculos.dividirPositivos(-1, -9);
			} catch (Exception e) {
				if (e instanceof InterException) {
					System.err.println("Ya ves por mudo");
				} else {
					e.printStackTrace();
				}
			}
		}

		System.out.println("Sigue funcionado");
	}
}
