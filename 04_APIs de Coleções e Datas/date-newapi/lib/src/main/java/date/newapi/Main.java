package date.newapi;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
	
	public static void main(String[] args) {
		
		//Calculado tempo vivido
		String dataNasc = "03/05/1991 10:10:00";
		
		LocalDateTime ldt = LocalDateTime.parse(dataNasc, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		LocalDateTime now = LocalDateTime.now();
		
		//Para períodos menores
		Duration d = Duration.between(ldt, now);
		System.out.println(d.toHours() + " horas vividas.");
		System.out.println(d.toDays() + " dias vividos.");

		//Para períodos maiores
		Period p = Period.between(ldt.toLocalDate(), now.toLocalDate());
		System.out.println(ChronoUnit.WEEKS.between(ldt, now) + " semanas vividas.");
		System.out.println(p.toTotalMonths() + " meses vividos.");
		System.out.println(ChronoUnit.YEARS.between(ldt, now) + " anos vividos.");
		
		//Ano e mês (para data de validade de cartões de crédito, por exemplo)
		YearMonth ym = YearMonth.of(2030, 10);
		Month month = Month.of(3);		
	}
}
