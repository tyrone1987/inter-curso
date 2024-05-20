package ec.test.test.variables;

public class MainOperadores {
	
	public static void main(String[] args) {
		Operadores operadores = new Operadores(8,0);

	/*  System.out.println(operadores.sumar());
		System.out.println(operadores.sumarUno(2));
		
		operadores.setA(10);
		operadores.setB(5);
		
		
		System.out.println(operadores.dividir());
		
		operadores.setA(10);
		operadores.setB(8);
		
		System.out.println(operadores.restar());
		operadores.setA(10);
		operadores.setB(50);
		System.out.println(operadores.multiplicar());
		System.out.println(operadores.sumarString());
		*/
		System.out.println(operadores.desplazarDerecha());
		System.out.println(operadores.desplazarIzquierda());
		
		
	}
}
