package ec.com.banco.internacional.colecciones;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import ec.com.banco.internacional.models.Agencia;
import ec.com.banco.internacional.models.Cliente;

public class MainColecciones4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Cliente> clientes = new LinkedList<>();
		//select * from cliente;
		clientes.add(new Cliente("anibal", 10, "M", new Date(), Agencia.SUR)); //compara en el sector 1
		clientes.add(new Cliente("anibal", 10, "M", new Date(), Agencia.NORTE)); //compara en el sector 2
		clientes.add(new Cliente("luis", 15, "M", new Date(), Agencia.CENTRO)); //compara en el sector 3
		clientes.add(new Cliente("carlos", 3, "M", new Date(), Agencia.SUR)); //compara en el sector 4
		clientes.add(new Cliente("fernando", 9, "M", new Date(), Agencia.SUR));
		clientes.add(new Cliente("jesica", 60, "M", new Date(), Agencia.SUR));
		clientes.add(new Cliente("valentina", 80, "M", new Date(), Agencia.NORTE));

		//select * from cliente where agencia = sur;
		List<Cliente> clienSur = new LinkedList<>();
		
		for (Cliente c : clientes) {
			if(c.getAgencia() == Agencia.SUR) {
				clienSur.add(c);
			}
		}
		
		System.out.println(clienSur);
		
		
		
		List<Cliente> clienSur2 = clientes.stream()
                    .filter(c -> c.getAgencia().equals(Agencia.SUR)).collect(Collectors.toList());
		System.out.println(clienSur);
		
	}

}
