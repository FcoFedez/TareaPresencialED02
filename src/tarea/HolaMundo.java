package tarea;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class HolaMundo {

	public static void main(String[] args) {
		
		System.out.println("Hola Mundo");
		
		Calendar calendario = new GregorianCalendar();
		int hora, minutos, segundos;
	    hora =calendario.get(Calendar.HOUR_OF_DAY);
	    minutos = calendario.get(Calendar.MINUTE);
	    segundos = calendario.get(Calendar.SECOND);
	    
	    System.out.println("son las" +hora + ":" + minutos + ":" + segundos);

	}

}
