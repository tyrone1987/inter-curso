package ec.test.test.variables.pupiales;

import java.util.List;
import java.util.ArrayList;

public class MainCliente1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Cliente1> lista = new ArrayList<Cliente1>();
		
		lista.add(new Cliente1( "Marcelo",48));
		lista.add(new Cliente1("Richard", 40));
		
		System.out.print(lista);
		
		
	}

}
