package ec.com.banco.internacional.colecciones;

import java.util.Date;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import ec.com.banco.internacional.models.Cliente;
import ec.com.banco.internacional.models.TipoCliente;

public class MainMaps {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		
		//  Clave
		//	Key **********
		//  Identificador,   Valor
		Map<   String    , Integer> mapa1 = new LinkedHashMap<>();
		mapa1.put("e", 8);
		mapa1.put("f", 20);
		mapa1.put("e", 5);
		mapa1.put("a", 1);
		mapa1.put("b", 2);
		mapa1.put("c", 3);
		mapa1.put("d", 4);
		
		
		//Integer valor = mapa1.get("f");
		//System.out.println(valor);
		for (Map.Entry<String, Integer> miVariable : mapa1.entrySet()) {
			String  key = miVariable.getKey();
			Integer val = miVariable.getValue();
			System.out.println("Key " + key + ",Valor " + val);
		}
		
		System.out.println();
		Cliente c = new Cliente();
		c.setEdad(50);
		c.setFehcaNacimiento(new Date());
		c.setGenero("F");
		c.setNombre("Melinda");
		
		Map<Long, Cliente> mapa2 = new HashMap<Long, Cliente>();
		mapa2.put(8565465446546546546l, c);
		mapa2.put((long)1,new Cliente("anibal", 10,"M", new Date()));
		mapa2.put(3l,new Cliente("luis", 15,"M", new Date()));
		mapa2.put(8l,new Cliente("carlos", 3,"M", new Date()));
		mapa2.put(2l,new Cliente("fernando", 9,"M", new Date()));
		mapa2.put(4l,new Cliente("jesica", 60,"M", new Date()));
		mapa2.put(5l,new Cliente("valentina", 80,"M", new Date()));
		mapa2.get(2l);
		for (Map.Entry<Long, Cliente> miVariable : mapa2.entrySet()) {
			Long  key = miVariable.getKey();
			Cliente val = miVariable.getValue();
			System.out.println("Key " + key + ",Valor " + val);
		}
		
		
		Map<TipoCliente, List<Cliente>> mapa3 = new HashMap<>();
		
		List<Cliente> clientes = new LinkedList<>();
		clientes.add(c);
		Cliente c2 = new Cliente("anibal", 10,"M", new Date());
		clientes.add(c2);
		clientes.add(new Cliente("anibal", 10,"M", new Date()));
		clientes.add(new Cliente("luis", 15,"M", new Date()));
		
		mapa3.put(TipoCliente.BUENO, clientes);
		
		List<Cliente> clientes2 = new LinkedList<Cliente>();
		
		clientes2.add(new Cliente("vilma", 60,"M", new Date()));
		clientes2.add(new Cliente("fernando", 9,"M", new Date()));
		
		mapa3.put(TipoCliente.MALO, clientes2);
		
		List<Cliente> clientes3 = new LinkedList<Cliente>();
		
		clientes3.add(new Cliente("valentina", 80,"M", new Date()));
		clientes3.add(new Cliente("carlos", 3,"M", new Date()));
		mapa3.put(TipoCliente.FEO, clientes3);
		
		for (Map.Entry<TipoCliente, List<Cliente>> miVariable : mapa3.entrySet()) {
			TipoCliente  key = miVariable.getKey();
			List<Cliente> val = miVariable.getValue();
			System.out.println("Key " + key );
			System.out.println(val);
		}
		
		*/
		
	}

}
