package ec.com.banco.internacional.colecciones;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ec.com.banco.internacional.models.Agencia;
import ec.com.banco.internacional.models.Cliente;
import ec.com.banco.internacional.models.TipoCliente;

public class MainColeccion3 {
	public static void main(String[] arg) {
		List<Cliente> clientes = new LinkedList<>();

		clientes.add(new Cliente("anibal", 10, "M", new Date(), Agencia.SUR));
		clientes.add(new Cliente("anibal", 10, "M", new Date(), Agencia.NORTE));
		clientes.add(new Cliente("luis", 15, "M", new Date(), Agencia.CENTRO));
		clientes.add(new Cliente("carlos", 3, "M", new Date(), Agencia.SUR));
		clientes.add(new Cliente("fernando", 9, "M", new Date(), Agencia.SUR));
		clientes.add(new Cliente("jesica", 60, "M", new Date(), Agencia.SUR));
		clientes.add(new Cliente("valentina", 80, "M", new Date(), Agencia.NORTE));

		Map<Agencia, List<Cliente>> mapa3 = new HashMap<>();

		List sur = new LinkedList<Cliente>();
		List centro = new LinkedList<Cliente>();
		List norte = new LinkedList<Cliente>();

		for (Cliente cliente : clientes) {
			if (cliente.getAgencia().equals(Agencia.SUR)) {
				sur.add(cliente);
			} else if (cliente.getAgencia().equals(Agencia.CENTRO)) {
				centro.add(cliente);
			} else {
				norte.add(cliente);
			}
		}

		mapa3.put(Agencia.SUR, sur);
		mapa3.put(Agencia.CENTRO, centro);
		mapa3.put(Agencia.NORTE, norte);
		mapa3.put(Agencia.CUENCA, norte);


		
		Map<Agencia, List<Cliente>> mapa4 = new HashMap<>();

		Agencia[] ag = Agencia.values();
		for (Agencia agencia : ag) {
			mapa4.put(agencia, new LinkedList<Cliente>());
		}

		for (Cliente cliente : clientes) {
			List clientes1 = mapa4.get(cliente.getAgencia());
			clientes1.add(cliente);
		}

		for (Map.Entry<Agencia, List<Cliente>> entry : mapa4.entrySet()) {
			Agencia key = entry.getKey();
			System.out.println(key);
			List val = entry.getValue();
			System.out.println(val);
		}
		
		
		
		Map<Agencia, List<Cliente>> mapa5 = new HashMap<>();

		for (Agencia agencia : ag) {
			mapa5.put(agencia, clientes
					.stream()
					.filter(c -> c.getAgencia().equals(agencia))
					.collect(Collectors.toList()));
		}

		for (Map.Entry<Agencia, List<Cliente>> entry : mapa5.entrySet()) {
			Agencia key = entry.getKey();
			System.out.println(key);
			List val = entry.getValue();
			System.out.println(val);
		}
		
	}
}
