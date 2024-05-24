package ec.com.banco.internacional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

import ec.com.banco.internacional.models.Cliente;

public class MainFechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date fechaactual = new Date(1716510304879l);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd 'de' MMMM 'del' yyyy, HH:mm");
		System.out.println(dateFormat.format(fechaactual));
		try {
			//System.out.println(dateFormat.parse("03/11/1987"));
			
			//Date fecha = dateFormat.parse("03/11/1987");
			
			Calendar calendar = Calendar.getInstance();
			int year = calendar.get(Calendar.YEAR);
			System.out.println(year);
			//cambio de fecha
			//calendar.setTime(fecha);
			calendar.add(Calendar.YEAR, 2);
			calendar.add(Calendar.YEAR, -2);
			calendar.set(Calendar.YEAR, 1977);
			int year2 = calendar.get(Calendar.YEAR);
			System.out.println(year2);
			
			LocalDateTime dateTime = LocalDateTime.now();
			dateTime.withYear(1978);
			Date fecha3 = Date.from(dateTime.atZone
					(ZoneId.systemDefault()).toInstant());
			
			Cliente cliente = new Cliente();
			cliente.setFehcaNacimiento(fecha3);
			
			System.out.println("fecha actual localdatetime " + dateTime);
			LocalDateTime dateTime2 = dateTime.plusYears(2);
			
			System.out.println("fecha actual localdatetime " + dateTime2);
			LocalDate localDate = LocalDate.now();
			
			System.out.println("fecha actual localdate " + localDate);
			
			LocalTime localTime = LocalTime.now();
			System.out.println(localTime);
			
			int minutos = localTime.getMinute();
			System.out.println(minutos);
			
			Instant instant = fecha3.toInstant();
					
			LocalDateTime lodati = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
			LocalDate lo = localDate.minusYears(1987).minusDays(03).minusMonths(11);
			
			
			System.out.println(System.currentTimeMillis());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
		 * 
		 SimpleDateFormat dateFormat = new SimpleDateFormat("dd 'de' MMMM 'del' yyyy");
		 SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		 
		 Date fecha = dateFormat.parse("03/11/1987");
		 
		 Calendar calendar = Calendar.getInstance();
		 
		 
		 LocalDateTime dateTime = LocalDateTime.now();
		 LocalDate date = LocalDateTime.now();
		 LocalTime time = LocalDateTime.now();
		 
		 
		  */
		
		//1716509747760
		//1716509762774
		
	}
}
