package Default;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
	LocalDate d04 = LocalDate.parse("2022-07-20");
	LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
	Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
	
	//Manipulando e formatando a hora e data
	//DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	//DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	//DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
	//DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
	//DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
	
	//System.out.println("d04 = " + d04.format(fmt1));
	//System.out.println("d04 = " + fmt1.format(d04));
	//System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	
	//System.out.println("d05 = " + d05.format(fmt1));
	//System.out.println("d05 = " + d05.format(fmt2));
	
	//System.out.println("d06 = " + fmt3.format(d06));
	//System.out.println("d06 = " + fmt5.format(d06));
	//System.out.println("d06 = " + d06.toString());
	
	//Manipulando e obtendo determinado de tipos de dados dentro da hora e data
	//LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
	//LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
	//LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
	//LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
	//System.out.println("r1 = " + r1);
	//System.out.println("r2 = " + r2);
	//System.out.println("r3 = " + r3);
	//System.out.println("r4 = " + r4);
	
	//System.out.println("d04 dia = " + d04.getDayOfMonth());
	//System.out.println("d04 Mês = " + d04.getMonthValue());
	//System.out.println("d04 Ano = " + d04.getYear());
	
	//System.out.println("d05 Hora = " + d05.getHour());
	//System.out.println("d05 Hora = " + d05.getMinute());
	
	//Calculando a data e a hora
	LocalDate pastWeekLocalDate = d04.minusDays(7);
	LocalDate nextWeekLocalDate = d04.plusDays(7);
	
	System.out.println ("pastWeekLocalDate = " + pastWeekLocalDate);
	System.out.println ("nextWeekLocalDate = " + nextWeekLocalDate); 
}
}