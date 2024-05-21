package ec.test.test.variables.pupiales;

public class MainOperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a = 150;
		int b;
		int m = 2;
		if (a >0 && m>0) {
		
		float x = a*m/100;
		
		System.out.println("Valor descuento "+ x);
		 b = (int)x;
		 System.out.println( "Descuento Entero " + b);
		 
		Integer c = Integer.valueOf(b) ;
		
		System.out.println( "Descuento Wrapper " + c);
		}
		else {
			System.out.println( "Datos incorrectos " );
		}
	}

}
