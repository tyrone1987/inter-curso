package ec.com.banco.internacional.colecciones;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MainColecciones5 {
	public static void main(String[] args) {
		final int multimplo = 5;
		AtomicInteger sum = new AtomicInteger(0);
		List<Integer> numeros = Arrays.asList(1, 2, 3, 5, 8, 9, 2, 20);
		Integer[] array = new Integer[] { 1, 2, 3, 5, 8, 9, 2, 20 };
		List num = Arrays.asList(array);
		for (Object object : num) {
			int a = (int) object;
		}

		List<Integer> numerosPares = numeros.stream().filter(item -> item % 2 == 0).toList();
		int suma = 0;
		for (Integer par : numerosPares) {
			suma += par;
		}

		System.out.println(suma);
		numerosPares.forEach(n -> {
			if (n == multimplo)
				sum.addAndGet(n);
		});

		System.out.println(sum);

		int suma2 = numeros.stream().filter(item -> item % 2 == 0).mapToInt(Integer::intValue).sum();

		Double promedio =
				numeros.stream().mapToInt(Integer::intValue).average().orElse(Double.NaN);
		
		
		
		System.out.println("Lista " + numeros);
		System.out.println("Lista pares" + numerosPares);
		System.out.println("Suma " + suma);
		System.out.println("Suma_2 " + suma2);
		System.out.println("Promedio " + promedio);
	}
}
