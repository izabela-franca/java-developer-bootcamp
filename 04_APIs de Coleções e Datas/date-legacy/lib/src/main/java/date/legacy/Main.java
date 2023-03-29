//DATE: utilizado para representar um espaço no tempo
//CALENDAR: utilizado para operações
package date.legacy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	
	public static void main(String[] args) throws Exception{
		
		//Buscando a data atual
		Date now = new Date();
		System.out.println(now);
		
		//Buscando datas especificadas
		Calendar calendar = Calendar.getInstance();
		calendar.set(2030, 4, 3, 10, 10, 00);
		System.out.println(calendar.getTime());
		
		//Alterando campos (.YEAR, .MONTH, .DAY)
		calendar.set(Calendar.YEAR, 2035);
		calendar.add(Calendar.YEAR, 2);
		System.out.println(calendar.getTime());

		//Parse de datas
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = sdf.parse("03/12/2000 15:30:15");
		System.out.println(d);
		String s = sdf.format(d);
		System.out.println(s);
	}
}
