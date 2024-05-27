package ec.com.banco.internacional.colecciones;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import ec.com.banco.internacional.models.Agencia;
import ec.com.banco.internacional.models.Cliente;

public class MainColecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arreglo = new int[5];
		arreglo[0] = 1;
		arreglo[1] = 2;
		arreglo[2] = 3;
		arreglo[3] = 4;
		arreglo[4] = 5;
		// este es mi limite

		List<String> lista = new ArrayList<>();
		lista.add("e");// puneter q hace referencia
		lista.add("a");// puneter q hace referencia al valor b
		lista.add("b");// puneter q hace referencia al valor c
		lista.add("c");// puneter q hace referencia al valor d
		lista.add("d");// puneter q hace referencia al valor e
		lista.add("e");// puneter q hace referencia
		lista.add("e");// puneter q hace referencia
		lista.add("e");// puneter q hace referencia
		lista.add("e");// puneter q hace referencia
		
		String a = lista.get(4);
		System.out.println(a);
		
		System.out.println(lista);
		lista.remove(0);
		System.out.println(lista);
		lista.remove("c");
		System.out.println(lista);
		lista.remove(0);
		System.out.println(lista);

		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) == "e") {
				System.out.println(i+1);
			}
		}
		
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) == "d") {
				try {
					lista.remove(i + 1);
				} catch (Exception e) {
					// TODO: handle exception
					System.err.println(e.getMessage());
				}
			}
		}
		System.out.println(lista);
		lista.clear();
		System.out.println(lista);
		
		List<Integer> listaLinked = new LinkedList<>();
		listaLinked.add(5);//puentero apunta al utimo y al siguiente
		listaLinked.add(5);// este apunta al siguiente y al anterior
		listaLinked.add(5);// este apunta al siguiente y al anterior
		listaLinked.add(5);// este apunta al siguiente y al anterior
		listaLinked.add(5);// este apunta al anterior y al primero
		
		System.out.println(listaLinked);
		
		Cliente c = new Cliente();
		c.setEdad(50);
		c.setFehcaNacimiento(new Date());
		c.setGenero("F");
		c.setNombre("Melinda");
		
		List<Cliente> clientes = new LinkedList<>();
		
		clientes.add(c);
		Cliente c2 = new Cliente("anibal", 10,"M", new Date(), Agencia.CENTRO);
		clientes.add(c2);
		
		clientes.add(new Cliente("anibal", 10,"M", new Date(), Agencia.CENTRO));
		clientes.add(new Cliente("luis", 15,"M", new Date(), Agencia.CENTRO));
		clientes.add(new Cliente("carlos", 3,"M", new Date(), Agencia.CENTRO));
		clientes.add(new Cliente("fernando", 9,"M", new Date(), Agencia.CENTRO));
		clientes.add(new Cliente("jesica", 60,"M", new Date(), Agencia.CENTRO));
		clientes.add(new Cliente("valentina", 80,"M", new Date(), Agencia.CENTRO));
		
		for (Cliente miCliente : clientes) {
			System.out.println(miCliente.getNombre());
			
		}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
