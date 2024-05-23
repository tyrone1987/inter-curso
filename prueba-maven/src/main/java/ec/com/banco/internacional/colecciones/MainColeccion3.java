package ec.com.banco.internacional.colecciones;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
		mapa3.put(Agencia.SUR, clientes.get(0));
		mapa3.put(Agencia.CENTRO, clientes.get(2));
		mapa3.put(Agencia.NORTE, clientes.get(1));
	}
}
