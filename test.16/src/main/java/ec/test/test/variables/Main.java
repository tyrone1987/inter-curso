package ec.test.test.variables;

public class Main {
	
	private static final int horasLaborables = 8;
	
	private static int x = 1;
	private static String b= "hola";
	
	private String nombreVariable;
	
	static short entero= (short) 32767; // 32767 hasta -32767 
	static Short entero1 = Short.valueOf("32767");
	
	static int edad = 2147483647; //numeros negativos positivos 123(valor valido) 1635465748976541321345(desvordamiento de memoria)
	static Integer edad2 = 35;
	
	static long contador = 9223372036854775807l; //54654654654654654654654654 valor valido
	Long contado2;
	
	static boolean tieneError = true; // 0 - false, 1 - true
	Boolean tieneErorr2;
	
	static float costoPasaje = (float) 2.1; //1200.00
	Float costo2;
	
	static double valor= 136565.12; // negativos positivos deciamles
	Double valor2;
	
	static char a = 'A'; //un solo caracter 
	Character dos;
	
	static int[] clients;
	
	public static void main(String arg[]) {

		//Se inicializa cuando se sabe cuantas filas tiene mi arreglo
		String[] estadosCivil = new String[5];
		estadosCivil[0] = "Viudo";
		estadosCivil[1] = "UNIO LIBRE";
		
		String estadoCivilSelected = estadosCivil[0];
		
		System.out.println(estadoCivilSelected);
		
		//Se inicializar dinamicamente
		int count = 50; // este es un count a la base de datos
		clients = new int[count];
		
		for (int i = 0; i < clients.length; i++) {
			clients[i] = i;
		}
		
		for (int i = 0; i < clients.length; i++) {
			int entero3 = clients[i];
			System.out.println(entero3);
		}
		
		//Inicializar con datos previamiente cargados
		String[] diasSemana = new String[]{"LUNES","MARTES","MIERCOLES"};
		//estados[0] = "SIN NDA";
		
		/*for (int i = 0; i < estados.length; i++) {
			String entero3 = estados[i];
			System.out.println(entero3);
		}*/
		
		DiaSemana[] dias = {DiaSemana.LUNES, DiaSemana.MARTES};
		
		System.out.println(DiaSemana.JUEVES.name());
		System.out.println(DiaSemana.JUEVES.getCodigoDia());
		System.out.println(DiaSemana.JUEVES.getInicial());
		System.out.println(DiaSemana.valueOf("MIERCOLES").getInicial());
		
		DiaSemana[] diasS = DiaSemana.values();
		for (int i = 0; i < diasS.length; i++) {
			System.out.println(diasS[i].getCodigoDia());
			System.out.println(diasS[i].getInicial());
			System.out.println(diasS[i]);

		}
		
		Test t = new Test();
		t.setDiaSemana(DiaSemana.MARTES);
		System.out.println(t.getDiaSemana().getCodigoDia());
		
		double iva = Test.IVA;
		System.out.println(iva);
		//no se puede agregar mas a estados
		
		System.out.println(x + b);
	}
}
