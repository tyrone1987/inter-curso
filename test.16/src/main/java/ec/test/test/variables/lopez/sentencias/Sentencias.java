package ec.test.test.variables.lopez.sentencias;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Sentencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 8;
		int b= 8;
		
		if(a>b) {
			//Se ejecta algun codigo
			System.out.print("El mayor es a " + a);
		}else if(b > a){
			System.out.println("El mayor es b " + b);
		}else {
			System.out.println("a y b son iguales ");
		}
		
		boolean rs = false;
		if(!rs) {
			System.out.println("Ingresa al if");
		}else {
			System.out.println("NOOOOOO Ingresa al if");
		}
		
		List<String> lst = new LinkedList<String>();
		lst.add("Tyrone");
		for (int i = 0; i < lst.size(); i++) {
			System.out.println("indice" + lst.get(i));
		}
		
		for(String str : lst) {
			System.out.println(str);
		}
		
		switch ("a") {
		case "a": {
			System.out.println("a");
			break;
		}
		case "b": {
			System.out.println("b");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + "");
		}
		
		int c = 0;
		
		do {
			System.out.println(c);
			if(c == 2) {
//				break;
			}
			c++;
		}while(c < 3);
		System.out.println("");
		c = 0;
		while(c < 5) {
			System.out.println(c);
			c++;
		}
		
	}

}
