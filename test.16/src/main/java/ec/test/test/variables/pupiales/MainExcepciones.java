package ec.test.test.variables.pupiales;

public class MainExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = 5;
			int b = 6;
			double x = a/b;
		 
		} catch (Excepciones ex) {
			
			System.err.println(ex.getMessage() + ex);
			
		}
		
	}

}
