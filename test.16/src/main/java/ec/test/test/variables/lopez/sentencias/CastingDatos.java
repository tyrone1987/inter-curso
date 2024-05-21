package ec.test.test.variables.lopez.sentencias;

public class CastingDatos {

	public static void main(String[] arg) {
		
		//Casting implicito
		int a = 5;
		System.out.println(a);
		double b = (double)a;
		System.out.println(b);
		
		
		//Casting explicito
		double c = 2.5;
		System.out.println(c);
		int d = (int) c;
		System.out.println(d);
		
		
		//wrappers
		Integer e = Integer.valueOf(a);
		System.out.println(e);
		
		Double f = 2.0;
		System.out.println(f);
		System.out.println(f.intValue());
		
		int g = f.intValue();
		
		
	}
}
