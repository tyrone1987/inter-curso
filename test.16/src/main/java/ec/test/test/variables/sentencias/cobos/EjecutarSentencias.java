package ec.test.test.variables.sentencias.cobos;

import java.util.Scanner;

public class EjecutarSentencias {

	private static Scanner lecturainfo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String id;
		int opcion = 0;
		Operaciones opera = new Operaciones();
		
		System.out.println("1. SUMAR");
		System.out.println("2. RESTAR");
		System.out.println("3. MULTIPLICAR");
		System.out.println("4. DIVIDIR");
		System.out.println("Ingrese  la operacion que desea realizar");
		
		lecturainfo = new Scanner(System.in);
		opcion = lecturainfo.nextInt();
		
		switch (opcion) {
		case 1: {	
			System.out.println("El valor de la suma es :" + opera.Sumar(3, 4));	
			
			break;
		}
		case 2: {
			opera.Restar(3, 5);
			System.out.println("El valor de la suma es :" + opera.Restar(3, 4));	
			break;
		}
		case 3: {
			opera.Multiplicar(3, 5);
			System.out.println("El valor de la suma es :" + opera.Multiplicar(3, 4));	
			break;
		}
		case 4: {
			opera.Dividir(3, 0);
			System.out.println("El valor de la suma es :" + opera.Dividir(3, 4));			
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + "");
		}

	}

}
